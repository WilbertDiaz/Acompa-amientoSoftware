public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Café Simple";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
