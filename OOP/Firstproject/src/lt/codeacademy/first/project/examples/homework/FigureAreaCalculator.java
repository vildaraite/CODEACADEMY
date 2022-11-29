package lt.codeacademy.first.project.examples.homework;

public class FigureAreaCalculator {
    private double a;
    private double b;

    public FigureAreaCalculator(){

    }

    public FigureAreaCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static double repeatStaticCalculator(int i, int i1) {
        return i / i1;
    }

    public double triangleArea(){
        return a * b / 2;
    }

    public double rectangleArea(){
        return a * b;

    }

    public double squareArea(){
        return a * a;
    }
    // KONSTANTU NAUDOJIMAS (pi)
    public double circleArea(){
        return Math.PI * Math.pow(a, 2);
    }

    public double repeatAreaCalculate (int a, int b, int c){
        repeatStaticCalculate(a, b);
        // SVARBU: ne statinis gali iskviesti statini metoda
        return a * b * c;
    }

    //apie statinius metodus: statinis metodas ar objektas sukuriamas tada, kai yra kompiliuojamas kodas
    //statiniu metodu, kitoje klaseje galima iskviest nekuriant tos klases objekto
    // tai darome klasesvardas.metodovardas
    // SVARBU: statinis METODAS, TIESIOGIAI NE STATINIO metodo iskviesti negali, jeigu negali iskviesti - kuriame objekta
    // prie ju laisvai prieiname nekurdami jokiu objekteu, del to static metodai yra kvieciami be objektu
    public static double repeatStaticCalculate(double a, double b){
        FigureAreaCalculator calculator = new FigureAreaCalculator();
        calculator.repeatAreaCalculate(50, 60,70);
        return a / b;
    }
}
