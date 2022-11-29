package lt.codeacademy.first.project.examples.tasks.fourth;
/*Sudarykite programą, kuri paprašytų vartotojo įvesti skaičių ir jį
atspausdintų tokiu formatu:J
us ivedete skaiciu 5
Čia 5 − vartotojo įvestas skaičius.
 */
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite skiaciu:");
        int numb = scanner.nextInt();

        FirstTask task = new FirstTask();
        task.printNumber(numb);
    }

    private void printNumber(int numb) {
        System.out.println("Jus ivedete skaiciu " + numb);

    }
}
