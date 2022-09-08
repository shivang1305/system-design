public class DebugLogger extends Logger {

    // parameterized constructor
    public DebugLogger(int levels) {
        this.levels = levels;
    }

    @Override
    public void displayLogInfo(String msg) {
        System.out.println("DEBUG INFO: " + msg);
    }

}
