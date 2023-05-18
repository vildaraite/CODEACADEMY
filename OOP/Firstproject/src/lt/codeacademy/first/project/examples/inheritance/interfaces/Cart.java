package lt.codeacademy.first.project.examples.inheritance.interfaces;

public interface Cart extends SecondCart {
    void printCartInfo();
    double getCartAmount();

    default void printDefaultInfo(){
        System.out.println("This is default method");
    }
}
