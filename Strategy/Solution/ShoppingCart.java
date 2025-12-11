public class ShoppingCart {
    private int total;

    public ShoppingCart() {
        this.total = 0;
    }

    public void addItem(int price) {
        this.total += price;
    }

    public void pay(PaymentStrategy paymentMethod) {
        paymentMethod.pay(this.total);
    }
}