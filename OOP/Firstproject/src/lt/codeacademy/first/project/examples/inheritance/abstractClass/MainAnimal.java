package lt.codeacademy.first.project.examples.inheritance.abstractClass;

public class MainAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog(15);
        int age = dog.getAge();
        dog.makeSound();
        dog.info();

        Animal animal = new Cat(7);
        age = animal.getAge();
        animal.makeSound();
        animal.info();

        // ANONIMINE KLASE
        Animal animalOne = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Anonimine klase");

            }

            @Override
            public int getAge() {
                return 56;
            }
        };

        animalOne.makeSound();
        animalOne.info();
    }
}
