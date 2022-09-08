public class Main {
    public static void main(String[] args) {
        OfficeInternetAccess internetAccess = new ProxyInternetAccess("Shivang Sharma");
        internetAccess.grantInternetAccess();
    }
}
