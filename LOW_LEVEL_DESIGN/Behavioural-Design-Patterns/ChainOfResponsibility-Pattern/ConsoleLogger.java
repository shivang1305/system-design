public class ConsoleLogger extends Logger {

    // parametrized constructor
    public ConsoleLogger(int levels) {
        this.levels = levels;
    }

    @Override
    public void displayLogInfo(String msg) {
        System.out.println("CONSOLE LOGGER INFO: " + msg);
    }

}
