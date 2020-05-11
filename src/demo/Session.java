package demo;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public final class Session {

    private static final Logger logger = new Logger(Session.class, 4);

    private static final AtomicInteger sessionPointer;

    static {
        sessionPointer = new AtomicInteger(0);
    }

    private String id;
    private Date timestamp;
    private Map<String, Object> attributes;

    public Session() {
        id = Base64
                .getEncoder()
                .encodeToString((sessionPointer.incrementAndGet() + ":" + new Random().nextInt()).getBytes())
                .toUpperCase();
        attributes = new LinkedHashMap<>();
        timestamp = new Date();
        logger.info("New session with id '" + getId() + "' created for login thread '" + Thread.currentThread().getName() + "'.");
    }

    public String getId() {
        return id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setAttribute(String name, Object value) {
        attributes.put(name, value);
    }

    public <T> T getAttribute(String name) {
        return (T) attributes.get(name);
    }

}
