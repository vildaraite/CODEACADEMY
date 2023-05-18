package lt.codeacademy.first.project.examples.inheritance.abstractClass;

public class Dog extends Animal {

    private final int age;

    public Dog( int age) {
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("Loja");

    }

    @Override
    public int getAge() {
        return age;
    }
}
