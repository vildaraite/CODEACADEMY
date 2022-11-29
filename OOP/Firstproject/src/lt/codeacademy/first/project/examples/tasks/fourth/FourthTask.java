package lt.codeacademy.first.project.examples.tasks.fourth;
/*Sukeiskite dviejų kintamųjų a ir b reikšmes vietomis.
Kintamasis a turi įgyti kintamojo breikšmę, o kintamasis b − kintamojo a reikšmę.
*/

import java.util.Scanner;


public class FourthTask {
    // du klases kintamieji
    private int a;
    private int b;

    public static void main(String[] args) {
        // sukuriam inputa vartotojui ivesti
        Scanner scanner = new Scanner(System.in);
        // sukuriam objekta, kad galetumem pasiekti metoda, kuris yra klaseje
        FourthTask task = new FourthTask();

        System.out.println("Iveskite a skaiciu:");
        // per objekto varda pasiimam kintamaji
        task.a = scanner.nextInt();

        System.out.println("Iveskite b skaiciu:");
        // per objekto varda pasiimame kita kintamaji
        task.b = scanner.nextInt();

        //issikvieciam metoda per objekto varda.metodo varda
        task.replaceValues();

        System.out.printf("replaced a=%s b=%s%n", task.a, task.b);

    }

    private void replaceValues() {
        // parepleisinom reiksmes, priskyrem tempui a, kad ji nedingu
        // tada a priskyrem b reiksmei, taciau po temp dar vis turime reiksme a
        //  ir b reiksmei priskiriame temp(a) reiksme
        //replace'as kintamuju
        // kazkur laikinai pasidedame, kad ji nedingtu
        int temp = a;

        a = b;
        b = temp;
    }
}
