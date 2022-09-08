import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // take input
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the name of the plan: ");
        String planName = scn.nextLine();

        System.out.println("Enter the number of units: ");
        int units = scn.nextInt();

        scn.close();

        // object creation
        Plan plan = PlanFactory.getPlan(planName);

        System.out.println("Plan Name is: " + planName);

        plan.getRate();
        System.out.println("Rate is: " + plan.rate);

        plan.calculateBill(units);
    }
}
