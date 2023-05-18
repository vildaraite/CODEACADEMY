package lt.codeacademy.first.project.examples.repeattasks;

import java.util.Scanner;

public class Mix {
    public static void main(String[] args) {
        Mix task = new Mix();
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite pirma zodi:");
        String one = sc.nextLine();

        System.out.println("Iveskite antra zodi:");
        String two = sc.nextLine();

        System.out.println(task.mixStrings(one, two));

    }

    public String mixStrings (String one, String two){
        // Labas
        // Vakaras
        int lenght = one.length() > two.length() ? one.length() : two.length();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < lenght ; i++) {
            if( i < one.length()){
                sb.append(one.charAt(i));
            }
        if (i < two.length()){
            sb.append(two.charAt(i));
            }
        }
        return sb.toString();

    }
}
