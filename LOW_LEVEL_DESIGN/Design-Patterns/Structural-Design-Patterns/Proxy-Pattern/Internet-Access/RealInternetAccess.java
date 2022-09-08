public class RealInternetAccess implements OfficeInternetAccess {
    private String employeeName;

    public RealInternetAccess(String empName) {
        employeeName = empName;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println("Internet Access is granted for employee: " + employeeName);
    }

}
