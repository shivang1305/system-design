public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();

        // dynamically change the fly behavior of the duck
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
