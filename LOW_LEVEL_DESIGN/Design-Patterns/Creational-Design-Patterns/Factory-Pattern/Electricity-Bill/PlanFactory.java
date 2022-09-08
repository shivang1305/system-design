public class PlanFactory {

    // this function is responsible for object creation of bill
    // static because its sole responsibility is to create an object
    public static Plan getPlan(String planName) {
        if (planName == null)
            return null;

        else if (planName.equalsIgnoreCase("domestic"))
            return new DomesticPlan();

        else if (planName.equalsIgnoreCase("commercial"))
            return new CommercialPlan();

        else if (planName.equalsIgnoreCase("industrial"))
            return new IndustrialPlan();

        return null;
    }
}
