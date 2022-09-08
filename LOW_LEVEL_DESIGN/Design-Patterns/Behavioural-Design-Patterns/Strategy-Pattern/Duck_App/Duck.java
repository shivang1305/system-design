public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    // deligating the assigned behaviors to the duck
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All duck float, even decoys!");
    }

    // setter methods -> to dynamically set the fly and quack behavior of duck
    public void setFlyBehavior(FlyBehavior fBehavior) {
        flyBehavior = fBehavior;
    }

    public void setQuackBehavior(QuackBehavior qBehavior) {
        quackBehavior = qBehavior;
    }
}