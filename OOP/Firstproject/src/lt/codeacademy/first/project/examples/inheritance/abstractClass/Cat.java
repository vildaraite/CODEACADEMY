package lt.codeacademy.first.project.examples.inheritance.abstractClass;

public class Cat extends Animal {

    private final int age;
    public Cat(int age) {
        this.age = age;
    }
    @Override
    public void makeSound() {
        System.out.println("Miauksi");

    }

    @Override
    public int getAge() {
        return age;
    }
}
