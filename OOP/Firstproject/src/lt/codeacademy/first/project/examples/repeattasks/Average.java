package lt.codeacademy.first.project.examples.repeattasks;

public class Average {
    public static void main(String[] args) {
        int[] mas = {7, 6, 5, 3, 67, 87};
        Average task = new Average();
        System.out.println(task.average(mas));

    }

    private double average (int[] mas) {
        double sum = 0;
        for(int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        return sum / mas.length;
    }

}
