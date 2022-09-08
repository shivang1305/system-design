import java.util.Scanner;

public class Main {
    private static int choice;

    public static void main(String[] args) {
        do {
            System.out.println("===============MOBILE SHOP=============");
            System.out.println("               1 -> IPHONE             ");
            System.out.println("               2 -> SAMSUNG            ");
            System.out.println("               3 -> BLACKBERRY         ");
            System.out.println("               4 -> EXIT               ");
            System.out.println("Enter your choice");

            Scanner scn = new Scanner(System.in);
            choice = scn.nextInt();

            Shopkeeper shopkeeper = new Shopkeeper();

            switch (choice) {
                case 1:
                    shopkeeper.iphoneSale();
                    break;

                case 2:
                    shopkeeper.samsungSale();
                    break;

                case 3:
                    shopkeeper.blackberrySale();
                    break;

                default:
                    System.out.println("Nothing is purchased");
                    return;
            }
        } while (choice != 4);
    }
}
