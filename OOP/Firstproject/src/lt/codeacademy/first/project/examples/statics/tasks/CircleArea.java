package lt.codeacademy.first.project.examples.statics.tasks;

public class CircleArea {
    public static void main(String[] args) {
        CircleArea task = new CircleArea();
        double radius = task.calculateRadius(99.9);

        System.out.println(radius);

    }

    private double calculateRadius(double radius){
        return 2 * Math.PI * radius;
    }

}
