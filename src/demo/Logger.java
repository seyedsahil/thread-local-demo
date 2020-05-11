package demo;

public final class Logger {

    private Class<?> clazz;
    private int level;

    public Logger(Class<?> clazz, int level) {
        this.clazz = clazz;
        this.level = level;
    }

    public void info(Object message) {
        log("[INFO]", message);
    }

    public void error(Object message) {
        log("[ERROR]", message);
    }

    public void warn(Object message) {
        log("[WARN]", message);
    }

    private void log(String type, Object message) {
        char[] tabs = new char[level];
        for (int i = 0; i < level; i++) {
            tabs[i] = '\t';
        }
        String className = String.format("%1$" + 20 + "s", clazz.getSimpleName()).replace(' ', ' ');
        System.out.println(className + " " + type + " " + new String(tabs) + " " + message);
    }

}
