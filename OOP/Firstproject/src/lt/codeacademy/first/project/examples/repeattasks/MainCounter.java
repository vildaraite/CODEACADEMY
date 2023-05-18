package lt.codeacademy.first.project.examples.repeattasks;

public class MainCounter {
    public static void main(String[] args) {
        Counter counter = new ChildCounter();
        counter.increment();
        counter.increment();
        counter.increment();
    }
}
