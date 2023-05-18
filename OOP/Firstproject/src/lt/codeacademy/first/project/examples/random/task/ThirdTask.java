package lt.codeacademy.first.project.examples.random.task;

import java.util.Random;

public class ThirdTask {
    public static void main(String[] args) {
        int[] mas = new int[10];
        Random random = new Random();

        for(int i = 0; i < 100000; i++) {
            int numb = random.nextInt(10);
            mas[numb]+= 1;
        }

        for(int i = 0; i < mas.length; i++) {
            System.out.printf("%s count:%s%n", i +1, mas[i]);
        }
    }
}