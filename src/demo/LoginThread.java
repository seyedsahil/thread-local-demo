package demo;

import java.util.Random;

public final class LoginThread extends Thread {

    private static final Logger logger = new Logger(LoginThread.class, 0);

    public LoginThread(String username) {
        super("[" + LoginThread.class.getSimpleName() + ": " + username + "]");
        logger.info("Login thread " + getName() + " has been created for '" + username + "'.");
        start();
    }

    @Override
    public void run() {
        SessionContextHolder sessionContextHolder = SessionContextHolder.getInstance();
        int counter = 10;
        while (--counter != 0) {
            Session session = sessionContextHolder.retrieve();
            logger.info("Login thread '" + getName() + "' is using session '" + session.getId() + "'.");
            session.setAttribute("data", "data-" + getName().toLowerCase() + "-" + new Random().nextInt() + "'.");
            logger.info("Login thread '" + getName() + "' put '" + session.getAttribute("data") + " to session '" + session.getId() + "'.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                logger.error("Unknown error in login thread '" + Thread.currentThread().getName() + "'.");
            }
        }
    }
}
