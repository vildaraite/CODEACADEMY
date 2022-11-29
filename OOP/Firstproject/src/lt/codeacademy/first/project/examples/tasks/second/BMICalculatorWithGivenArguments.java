package lt.codeacademy.first.project.examples.tasks.second;

public class BMICalculatorWithGivenArguments {
    //pasiduodant per configuration'a argumentus

    public static double WEIGHT = 70;
    public static double HEIGHT = 1.69;

    public static void main(String[] args) {

        double weight = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);


        double bmi = calculateBMI(weight, height);
        System.out.printf("Your BMI is %s", bmi);

    }

    public static double calculateBMI(double weight, double height){
        return weight/ Math.pow(height, 2);
    }
}

