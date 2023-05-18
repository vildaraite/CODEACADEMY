package lt.codeacademy.first.project.examples.constants;


import lt.codeacademy.first.project.examples.scanner.ScannerExample;

import java.util.Scanner;

public class TaskFourth {
    public static void main(String[] args) {
        System.out.println("Please, enter a math expression");
        String[] input = getInput().split(" "); // nn x nn

        double number1 = Double.parseDouble(input[0]);
        double number2 = Double.parseDouble(input[2]);
        String symbol = input[1];

        TaskFourthCalculator calculator = new TaskFourthCalculator();
        double result = calculator.calculate(number1,number2,symbol);


    }

    public static String getInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
