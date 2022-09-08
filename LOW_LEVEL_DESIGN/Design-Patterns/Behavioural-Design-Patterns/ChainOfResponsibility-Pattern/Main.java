public class Main {
    private static Logger doChaining() {
        Logger consoleLogger = new ConsoleLogger(Logger.CONSOLEINFO);
        Logger errorLogger = new ErrorLogger(Logger.ERRORINFO);
        Logger debuLogger = new DebugLogger(Logger.DEBUGINFO);

        consoleLogger.setNextLevelLogger(errorLogger);
        errorLogger.setNextLevelLogger(debuLogger);

        return consoleLogger;
    }

    public static void main(String[] args) {
        Logger chainLogger = doChaining();

        chainLogger.logMessage(Logger.CONSOLEINFO, "Enter the sequence of values");
        chainLogger.logMessage(Logger.ERRORINFO, "An error is occurred now");
        chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is complete");
    }
}
