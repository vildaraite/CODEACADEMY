package lt.codeacademy.first.project.examples;

public class ArithmeticExamples {
    //lapkricio 15d.
    public static void main(String[] args) {

        //int a = 10, int = 20, int = 30 - galima ir toks variantas surasymo, arba tas, kuris apacioje
        int a = 10;
        int b = 20;
        int c = 30;

        // visada rasome ko norime, sum, result, multiple ir t.t.
        int sum = a + b + (int) c;
        System.out.println("suma: " + sum);


        // jei vienas ju butu double, yra variantas, kad rasysime pries c tarkim skliaustuose (int)
        int minus = a - b;
        System.out.println("minus: " + minus);


        int multiple = a * 5;
        System.out.println("duagyba: " + multiple);


        double divider = c / b;
        System.out.println("dalyba: " + divider);


        System.out.println("ar skaicius yra lyginis:" + (c % 2 == 0));
        System.out.println("koks bus rezultatas: " + c++);

        //c++ pakelia po iteracijos, ++ ir -- dejimas reikalingas tam, kad ar as noriu tame veiksme matyti plius viena, ar kitame veiksme matyti plius ar minus viena
        //tame veiksme jei noriu matyti dedu pries skaiciu ++, jei noriu kitame - dedu po ++
        System.out.println("koks bus rezultatas:" + c);
        c += 10;
        System.out.println("koks bus rezultatas: " + c);
        c -= 5;
        System.out.println("koks bus rezultatas: " + c);
    }
}