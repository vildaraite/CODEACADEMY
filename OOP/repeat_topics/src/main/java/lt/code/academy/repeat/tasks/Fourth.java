package lt.code.academy.repeat.tasks;
// susikurti scanneri
// susikurti kintamaji sum, kuris kol kas yra lygus nuliui
// susikurti masyva penkiu skaiciu
// prabegti pro visus penkis su foru ir irasyti i kiekviana elementa varotojo inputa
//
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Įveskite skaičių: ");
            int num = sc.nextInt();
            sum += num;
            numbers[i] = num;
        }

        System.out.println("Įvestų skaičių suma: " + sum);
        System.out.print("Visi įvesti skaičiai: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
