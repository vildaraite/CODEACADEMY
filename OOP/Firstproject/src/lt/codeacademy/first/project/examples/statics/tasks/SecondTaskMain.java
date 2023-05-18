package lt.codeacademy.first.project.examples.statics.tasks;

public class SecondTaskMain {
    public static void main(String[] args) {
        SecondTask task = new SecondTask();

        new SecondTask();
        new SecondTask();
        new SecondTask();
        new SecondTask();
        new SecondTask();

        System.out.println(SecondTask.count);
        SecondTask.cleanUp();
        System.out.println(SecondTask.count);


    }
}
