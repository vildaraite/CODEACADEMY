package lt.codeacademy.first.project.examples.finals.task;

public class ThirdTask {
    private static final float PI = 3.14f;
    public static void main(String[] args) {
        ThirdTask task = new ThirdTask();
        float radius = task.calculateRadius(99.9f);

        System.out.println(radius);
    }
    private float calculateRadius(float radius) {
        //return (float) (2 * Math.PI * radius);
        return 2 * PI * radius;
    }
}