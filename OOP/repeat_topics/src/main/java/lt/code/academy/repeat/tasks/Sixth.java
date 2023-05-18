package lt.code.academy.repeat.tasks;

import java.util.Arrays;

public class Sixth {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4};
        String[] words = {"a", "b", "c", "d"};
        Object[] newArray = new Object[numbers.length + words.length];

        int count = 0;


        for (int i = 0; i < numbers.length; i++) {

            newArray[i + count] =  numbers[i];
            newArray[i + count + 1] = words[i];
            count++;
        }

        System.out.println(Arrays.toString(newArray));
    }
}
