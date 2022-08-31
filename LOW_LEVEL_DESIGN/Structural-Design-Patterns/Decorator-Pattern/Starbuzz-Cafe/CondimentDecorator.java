
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage; // Composition -> Condiment Decorator class HAS A Beverage & due to inheritance
                       // it is also IS A Beverage

    public abstract String getDescription();
}
