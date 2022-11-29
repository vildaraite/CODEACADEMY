package lt.codeacademy.first.project.examples.tasks.second;

import java.io.PrintStream;

public class GasAverage {
    public static void main(String[] args) {
      double distance = Double.parseDouble(args[0]);
      double litres = Double.parseDouble(args[1]);

      System.out.printf("Your car gas average: %s", average(distance, litres));
    }

    public static double average(double distance, double litres){
        // vidurkis = (kuro sanaudos * 100) / nuvaziuoto atstumo
        return litres * 100 / distance;
    }
}
