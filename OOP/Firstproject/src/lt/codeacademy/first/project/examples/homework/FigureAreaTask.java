package lt.codeacademy.first.project.examples.homework;

public class FigureAreaTask {
    public static void main(String[] args) {

        double a = 56.65;
        double b = 45.87;
        FigureAreaCalculator figureAreaCalculator = new FigureAreaCalculator(a, b);

        // cia turime ta ka mums grazina metodelis is figureAreaCalculator (1)
        double triangleArea = figureAreaCalculator.triangleArea();
        // ctrl + d PADUBLIUOJA EILUTE
        System.out.println("trikampio plotas: " + triangleArea);
        System.out.println("staciakampio plotas: " + figureAreaCalculator.rectangleArea());
        System.out.println("kvadrato plotas: " + figureAreaCalculator.squareArea());
        System.out.println("apskritimo plotas: " + figureAreaCalculator.circleArea() );
    }
}