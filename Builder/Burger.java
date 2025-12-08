public class Burger {
    private String size;
    private boolean cheese;
    private boolean bacon;
    private boolean lettuce;
    private boolean tomato;

    public Burger(String size, boolean cheese, boolean bacon, boolean lettuce, boolean tomato) {
        this.size = size;
        this.cheese = cheese;
        this.bacon = bacon;
        this.lettuce = lettuce;
        this.tomato = tomato;
    }

    @Override
    public String toString() {
        return "Burger [size=" + size + ", cheese=" + cheese + ", bacon=" + bacon + ", lettuce=" + lettuce + ", tomato=" + tomato + "]";
    }
}