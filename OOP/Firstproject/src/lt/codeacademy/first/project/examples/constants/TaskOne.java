package lt.codeacademy.first.project.examples.constants;

/*
 Parašyti programą, kuri leistų vartotojui įvesti norimą skaičių ir po to parašytų ar šis skaičius
yra lyginis, ar nelyginis. Užuomina panaudokite % operatoriu.
 */

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        // varas - trumpinys variable,
        var scanner = new Scanner(System.in);

        System.out.println("Iveskite skaiciu");
        // var'as
        var input = scanner.nextInt();
        boolean isEven = input % 2 == 0;

        if(isEven){
            System.out.println("skaicius lyginis");
        }else {
            System.out.println("skaicius yra nelyginis");
        }

    }
}
