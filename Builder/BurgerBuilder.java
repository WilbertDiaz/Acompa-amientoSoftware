public class BurgerBuilder {
    private String size;
    private boolean cheese;
    private boolean bacon;
    private boolean lettuce;
    private boolean tomato;

    public BurgerBuilder(String size) {
        this.size = size;
    }

    public BurgerBuilder addCheese() {
        this.cheese = true;
        return this;
    }

    public BurgerBuilder addBacon() {
        this.bacon = true;
        return this;
    }

    public BurgerBuilder addLettuce() {
        this.lettuce = true;
        return this;
    }

    public BurgerBuilder addTomato() {
        this.tomato = true;
        return this;
    }

    public Burger build() {
        return new Burger(size, cheese, bacon, lettuce, tomato);
    }
}