package lt.codeacademy.first.project.examples.inheritance.interfaces;

public class CartMain {
    public static void main(String[] args) {
        Cart cart = new ShoppingCart();
        cart.printCartInfo();
        cart.printDefaultInfo();
        System.out.println(cart.type);
    }
}

