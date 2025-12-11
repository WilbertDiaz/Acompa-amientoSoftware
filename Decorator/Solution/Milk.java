public class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", con Leche";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 1.5;
    }
}