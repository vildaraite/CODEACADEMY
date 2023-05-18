package lt.codeacademy.first.project.examples.finals.task;

class SecondTask {
    private static int age;
    private static final String name = "Andrius";

    void setValues(int age, String name) {
        this.age = age;
        //this.name = name;

        print();
    }

    void print() {
        System.out.println(age);
        System.out.println(name);
    }
}