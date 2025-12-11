public class Coffee extends HotBeverage {
    @Override
    public void brew() {
        System.out.println("Filtrando el café");
    }

    @Override
    public void addCondiments() {
        System.out.println("Agregando azúcar y leche");
    }
}