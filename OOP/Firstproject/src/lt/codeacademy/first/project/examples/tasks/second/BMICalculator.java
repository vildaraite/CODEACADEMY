package lt.codeacademy.first.project.examples.tasks.second;

public class BMICalculator {
    // lapkricio 21d.......kintamieji klases lygyje, konstanta su zodeliu final, konstantu su zodziu final negalima keisti


    public static final double WEIGHT = 70;
    public static final double HEIGHT = 1.69;

    public static void main(String[] args) {
        // KMI = mase (kg) / ugis (m))^2

        double bmi = calculateBMI();
        System.out.printf("Your BMI is %s", bmi);

    }

    public static double calculateBMI(){
        return WEIGHT/ Math.pow(HEIGHT, 2);
    }
}
