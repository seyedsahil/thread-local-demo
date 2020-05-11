package demo;

import java.util.Date;

public final class SessionContextHolder {

    private static final Logger logger = new Logger(SessionContextHolder.class, 2);

    private static final SessionContextHolder sessionContextHolder;

    static {
        sessionContextHolder = new SessionContextHolder();
    }

    public static SessionContextHolder getInstance() {
        return sessionContextHolder;
    }

    private final ThreadLocal<Session> sessionContext;

    private SessionContextHolder() {
        super();
        sessionContext = new ThreadLocal<>();
    }

    private Session create() {
        Session session = new Session();
        sessionContext.set(session);
        logger.info("Session '" + session.getId() + "' added for login thread '" + Thread.currentThread().getName() + "'.");
        return session;
    }

    public Session retrieve() {
        Session session = sessionContext.get();
        if (session == null) {
            logger.warn("Session doesn't exist for login thread '" + Thread.currentThread().getName() + "'.");
            return create();
        }
        logger.error("Session '" + session.getId() + "' exist for login thread '" + Thread.currentThread().getName() + "'.");
        Date currentTimeStamp = new Date();
        if (new Date().getTime() - session.getTimestamp().getTime() > 3000) {
            logger.warn("Session '" + session.getId() + "' is inactive for more than 3 seconds, will be invalidated.");
            sessionContext.remove();
            return create();
        }
        return session;
    }

}
