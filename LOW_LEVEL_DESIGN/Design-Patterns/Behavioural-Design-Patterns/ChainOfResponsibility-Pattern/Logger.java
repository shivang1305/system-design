public abstract class Logger {
    // Level of console logger
    public static int CONSOLEINFO = 1;

    // level of error logger
    public static int ERRORINFO = 2;

    // level of degug logger
    public static int DEBUGINFO = 3;

    protected int levels;
    protected Logger nextLevelLogger;

    // to set the next logger in the chain
    public void setNextLevelLogger(Logger nextLevelLogger) {
        this.nextLevelLogger = nextLevelLogger;
    }

    public void logMessage(int levels, String msg) {
        if (this.levels <= levels)
            displayLogInfo(msg);

        if (nextLevelLogger != null)
            nextLevelLogger.logMessage(levels, msg);
    }

    public abstract void displayLogInfo(String msg);

}