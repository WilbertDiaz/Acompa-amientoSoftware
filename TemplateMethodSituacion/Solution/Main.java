public class Main {
    public static void main(String[] args) {
        System.out.println("--- Preparando Té ---");
        HotBeverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("\n--- Preparando Café ---");
        HotBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}