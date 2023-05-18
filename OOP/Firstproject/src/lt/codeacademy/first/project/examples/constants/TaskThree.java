package lt.codeacademy.first.project.examples.constants;
/*
Parašyti programą funkcijos f(x) reikšmei surasti:
a. jei x teigiamas, tai f(x)=2x+8,
b. jei x neigiamas, tai f(x)=21-7x
 */


import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       long x = scanner.nextLong();

       if(x >= 0){
           var result = 2 * x + 8;
           System.out.println("rezultatas yra: " + result);
       } else if (x < 0 ){
           var result = 21- 7 * x;
           System.out.println("rezultatas yra:" + result);
       } else {
           System.out.println("skaicius nulis");
       }
    }
}
