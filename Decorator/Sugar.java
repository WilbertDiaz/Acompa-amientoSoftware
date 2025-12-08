public class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", con Azúcar";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 0.5;
    }
}
