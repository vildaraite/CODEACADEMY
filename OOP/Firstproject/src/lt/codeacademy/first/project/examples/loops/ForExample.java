package lt.codeacademy.first.project.examples.loops;

import java.util.Arrays;

public class ForExample {
    public static void main(String[] args) {
        // i yra kintamasis, kuris yra padidintas po kiekvienos ciklo iteracijos po viena per vieneta
        for(int i = 0; i < 10; i++) {
            System.out.println("labukas");
        }

        // kadangi i < mas.lenght ir yra zenklas maziau tai nereikia mums gale lenght'o uzdeti to -1
        int[] mas = {8, 5, 6, 3, 56, 3, 65};
        for(int i = 0; i < mas.length; i++){
            System.out.println(mas[i]);
        }

        //int[] mas = {8, 5, 6, 3, 56, 3, 65};
        //for(int i = 0; i <= mas.length - 1 ; i++){
         //   System.out.println(mas[i]);
        // o cia, kadangi yra maziau arba lygu tada jau dedame - 1 gale

        System.out.println("______________");
        // for from JDK6-7
        for(int a: mas){
            System.out.println(a);
        }

        System.out.println("________________");
        // arrays.strem(mas).forEach (v -> System.out.println(v));
        // abu tokie patys
        Arrays.stream(mas).forEach(System.out::println);
    }
}
