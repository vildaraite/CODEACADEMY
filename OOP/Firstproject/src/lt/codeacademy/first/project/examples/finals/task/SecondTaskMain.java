package lt.codeacademy.first.project.examples.finals.task;

public class SecondTaskMain {
    public static void main(String[] args) {
        SecondTask task = new SecondTask();
        SecondTask taskOne = new SecondTask();

        task.setValues(30, "Petras");
        taskOne.setValues(20, "Jonas");

        task.print();
    }
}