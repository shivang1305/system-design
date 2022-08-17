public class ProxyInternetAccess implements OfficeInternetAccess {
    private String employeeName;
    private RealInternetAccess realInternetAccess;

    public ProxyInternetAccess(String empName) {
        employeeName = empName;
    }

    @Override
    public void grantInternetAccess() {
        if (getRole(employeeName) > 4) {
            realInternetAccess = new RealInternetAccess(employeeName);
            realInternetAccess.grantInternetAccess();
        }

        else
            System.out.println("No Internet access is granted");

    }

    private int getRole(String empName) {
        // Check role from the database based on Name and Designation
        // return job level or job designation
        // and accordingly grant internet access
        return 9;
    }

}
