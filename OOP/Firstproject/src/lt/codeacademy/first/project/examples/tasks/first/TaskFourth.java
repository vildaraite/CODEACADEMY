package lt.codeacademy.first.project.examples.tasks.first;

public class TaskFourth {
    /*
      •Klasė turi main metodą, kuris kviečia jūsų sukurtus du static metodus:
      •m1() ir po to m2()•metodai turi gražinti double rezultatą
      •main metode: metodų rezultatai priskiriami kintamiesiams d1, d2
      •main metodas išspausdina jų sumą
      •m1() - metodas gražina double tipo reikšmę 123.5;
      •m2() - metodas gražina double tipo reikšmę kurią įvedame į programą
     */

    public static void main(String[] args) {
        double numbOne = firstMethod();
        double numbTwo = secondMethod();
        double sum = numbTwo + numbTwo;

        System.out.println("suma: " + sum);
    }
    public static double firstMethod(){
return 123.5;
    }

    public static double secondMethod(){

return 49.5;

    }
}
