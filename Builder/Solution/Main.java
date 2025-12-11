public class Main {
    public static void main(String[] args) {
        Burger burger = new BurgerBuilder("Large")
                .addCheese()
                .addBacon()
                .build();

        System.out.println(burger);

        Burger veggie = new BurgerBuilder("Medium")
                .addLettuce()
                .addTomato()
                .build();

        System.out.println(veggie);
    }
}