public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        cart.addItem(50);
        cart.addItem(100);

        cart.pay(new PaypalStrategy("usuario@ejemplo.com"));

        ShoppingCart cart2 = new ShoppingCart();
        cart2.addItem(200);
        cart2.pay(new CreditCardStrategy("Juan Perez", "1234-5678-9012-3456"));
    }
}