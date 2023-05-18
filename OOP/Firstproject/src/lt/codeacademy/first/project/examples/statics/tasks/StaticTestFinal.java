package lt.codeacademy.first.project.examples.statics.tasks;

class StaticTestFinal {

    private static int age;
    private final static String name = "WILDA";

    void toAdd(int age, String name){
        StaticTestFinal.age = age;

        System.out.println(age);
        System.out.println(name);
    }
}
