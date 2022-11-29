package lt.codeacademy.first.project.examples.repeat;

import lt.codeacademy.first.project.examples.homework.FigureAreaCalculator;
import org.w3c.dom.ls.LSOutput;

public class ConstructorExample {
    public ConstructorExample(){
        this(67);

    }
    public ConstructorExample(int a){
        this(56, 67);

    }

    public ConstructorExample(int a, int b){

    }

    public static void main(String[] args) {
        FigureAreaCalculator calculator = new FigureAreaCalculator();
        double result = calculator.repeatAreaCalculate( 50, 67, 56);
        System.out.println(result);

        double staticResult = FigureAreaCalculator.repeatStaticCalculator( 60, 50);
        System.out.println(staticResult);

    }

 }

