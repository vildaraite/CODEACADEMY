package lt.codeacademy.first.project.examples.method;

public class MethodExamples {
    //lapkricio 17d.
    /*overloadingas - kai sutampa metodu vardai, turi kazkas skirtis, kaip pvz parametrai
    metodu vardai sutampa, parametru skaicius arba tipas skiriasi, grazinamas tipas jam visiskai neaktualus
    PVZ sumos skaiciavimas su intais ir doublais, metodu vardai sutampa, taciau parametruose skiriasi tipas
     */

            public static int c;
            //visi metodai gali prie sio c prieiti, nes jis yra klases, o ne metodo lygyje - prieinamas visiems
    //kas yra tarp KLASES beginno ir endo, klases lygio kintamasis, kuris RASOMAS VIRSUJE

            public static void main(String[] args) {
                c = 10;
                System.out.println("c -> " + c);
                myMethod();
                mySecondMethod("Vilda");

                mySecondMethod("Svetlana");

                myThirdMethod(10, 50, "tekstas" );

                String text = myFourthMethod();
                System.out.println(text);
                mySecondMethod(text);//kaip mes panaudojame return metoda kituose metoduose, kurie negrazina

                sum(10, 10);

                int sum = sum(50,20);
                System.out.println(sum);

                System.out.println("c -> " + c);

                //System.out.println(sum(50, 60)); arba taip, jei reikia tik atsispausdinti rezultata galim naudoti
                //sita metoda, bet jeigu reikia prisiskirti kintaqmajam ir kazka su kintamuoju darysim - tada geriau
                //prisiskirti
            }

            public static void myMethod() {
                System.out.println("c -> " + c);
                //return; galime naudoti ir voide, jei nenorime, kad eitu buten i sita metoda, i jo vidu
                System.out.println("Mano pirmasis metodas");
            }

            public static void mySecondMethod(String name){
                System.out.printf("Labas %s, malonu susipazinti%n", name); //sita naudoti geriau
                System.out.println("Labas," + name + ",malonu susipazinti");
            }

            public static void myThirdMethod(int x, int y, String text){
                c = y;
                int sum = x + y;
                System.out.printf("Suma %s, perduotas tekstas: %s%n", sum, text);
            }

            public static String myFourthMethod() {
                //grazinantis Stringa metodas, kuriam reikia returno, matyti kad jame nieko nespausdiname
                //spausdinimas voidiniuose yra, returnas eina i klase ir spausdina ten, prisilygina metoda
                //kvieciame metoda per varda, mes zinome, kad gausime reiksme is stringo
                //issisaugau maine ta stringa po kazkokiu tekstu, jis pasiima ji, issisaugo ir pargrazina
                return "Grazinti reiksme is metodo";
            }

            public static int sum (int x, int y){
                return x+y;
            }
        }
