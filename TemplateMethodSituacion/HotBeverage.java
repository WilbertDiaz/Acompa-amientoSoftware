public abstract class HotBeverage {
    
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    public void boilWater() {
        System.out.println("Hirviendo agua");
    }

    public void pourInCup() {
        System.out.println("Sirviendo en la taza");
    }

    public abstract void brew();
    public abstract void addCondiments();
}