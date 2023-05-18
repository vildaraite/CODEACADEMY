package lt.codeacademy.first.project.examples.random.task;
import java.util.Random;

public class FirstTask {
    public static void main(String[] args) {
        Random random = new Random();

        int max = 0;
        for(int i = 0; i < 3; i++) {
            int randomValue = random.nextInt(100) + 1;
            System.out.println(randomValue);

            if( randomValue > max){
                max = randomValue;
            }
        }

        System.out.println("Max " + max);
    }
}