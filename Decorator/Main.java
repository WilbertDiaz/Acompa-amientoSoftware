public class Main {
    public static void main(String[] args) {
        // Café simple
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.cost());

        // Café con leche
        Coffee milkCoffee = new Milk(new SimpleCoffee());
        System.out.println(milkCoffee.getDescription() + " $" + milkCoffee.cost());

        // Café con leche y azúcar (Decorador sobre decorador)
        Coffee superCoffee = new Sugar(new Milk(new SimpleCoffee()));
        System.out.println(superCoffee.getDescription() + " $" + superCoffee.cost());
    }
}

