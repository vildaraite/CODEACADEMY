package lt.codeacademy.first.project.examples.finals.task;

class FirstTask {
    private int a;
    private final int b;

    FirstTask(int b) {
        this.b = b;
    }

    void changeValues(int a, int b) {
        this.a = a;
        //this.b = b;
        System.out.println(a);
        System.out.println(b);
    }
}