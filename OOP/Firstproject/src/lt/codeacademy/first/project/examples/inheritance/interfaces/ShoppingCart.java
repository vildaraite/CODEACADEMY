package lt.codeacademy.first.project.examples.inheritance.interfaces;

public class ShoppingCart implements Cart {
    @Override
    public void printCartInfo() {
        System.out.println("Cart total amount " + getCartAmount());
    }

    @Override
    public double getCartAmount() {
        return 999.09;
    }

    @Override
    public void secondCardMethod() {

    }
}

