public class Main {
    public static void main(String[] args) {
        Beverage beverage1 = new HouseBlend();

        System.out.println(beverage1.getDescription());
        System.out.println(beverage1.cost());

        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);

        System.out.println(beverage2.getDescription());
        System.out.println(beverage2.cost());

        Beverage beverage3 = new Espresso();
        beverage3 = new Whip(beverage3);
        beverage3 = new Mocha(beverage3);

        System.out.println(beverage3.getDescription());
        System.out.println(beverage3.cost());
    }
}
