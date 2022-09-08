public class ErrorLogger extends Logger {

    // parameterized consturctor
    public ErrorLogger(int levels) {
        this.levels = levels;
    }

    @Override
    public void displayLogInfo(String msg) {
        System.out.println("ERROR INFO: " + msg);
    }

}
