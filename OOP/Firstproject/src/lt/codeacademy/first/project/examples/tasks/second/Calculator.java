package lt.codeacademy.first.project.examples.tasks.second;

public class Calculator {
    public Calculator(){

    }
    // LAPKRICIO 21 d.
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        // TVARKINGESNIS ISRASYMO VARIANTAS APACIOJE
       System.out.printf("%s + %s = %s%n", a, b, sum(a, b));
        System.out.printf("minus %s%n", minus(a, b));
        System.out.printf("divider %s%n", divider(a, b));
        System.out.printf("multiply %s%n", multiply(a, b));


    }

    public static double sum(double a, double b){
        return a + b;
    }
    public static double minus(double a, double b){
        return a - b;
    }
    public static double divider(double a, double b){
        return a / b;
    }
    public static double multiply(double a, double b){
        return a * b;
    }
    public static double pow(double a, double b){
        return Math.pow(a, b);
    }
}
