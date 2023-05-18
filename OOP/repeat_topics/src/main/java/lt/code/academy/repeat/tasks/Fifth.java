package lt.code.academy.repeat.tasks;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = new String[5];

        System.out.println("Iveskite 5 zodzius: ");

        // begam iteruojames ir talpinam su kiekviena iteracija i savo
        // masyva po nauja zodi
        for (int i = 0; i < 5; i++) {
            words [i] = sc.nextLine();
        }

        System.out.println("Zodziai, kuriuos jus ivedete: ");

        for (String word : words ){
            System.out.println(word);
        }
    }

    /*
    private Object[] mix (Object [] numbers, Object [] words) {

        Object [] marge = new Object[numbers.length + words.length];

        int index = 0;

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = marge[i++];
            words[i] = marge[i++];
        }
        return marge;
    }
     */
}
