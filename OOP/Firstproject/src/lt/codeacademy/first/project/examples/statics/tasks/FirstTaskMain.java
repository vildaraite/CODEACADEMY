package lt.codeacademy.first.project.examples.statics.tasks;

public class FirstTaskMain {
    public static void main(String[] args) {

        FirstTask task = new FirstTask();
        task.setValue(10);

        FirstTask.staticMethod(10);
    }
}
