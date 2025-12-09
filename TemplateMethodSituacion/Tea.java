public class Tea extends HotBeverage {
    @Override
    public void brew() {
        System.out.println("Infusionando el té");
    }

    @Override
    public void addCondiments() {
        System.out.println("Agregando limón");
    }
}