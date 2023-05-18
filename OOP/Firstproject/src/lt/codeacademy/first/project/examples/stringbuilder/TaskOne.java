package lt.codeacademy.first.project.examples.stringbuilder;

public class TaskOne {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Liepa");
        stringBuilder.append("Antradienis");


        // LiepaAntradienis
        System.out.println(stringBuilder);
        //sineidartnAapeiL
        System.out.println(stringBuilder.reverse());
        //dartai
        System.out.println(stringBuilder.delete(0, 5).delete(4, 6).delete(5,7).delete(6,7));
        //dar2018
        System.out.println(stringBuilder.replace(3, 6, "2018"));
        // darom 2018
        System.out.println(stringBuilder.insert(3, "om "));
        //10
        System.out.println(stringBuilder.length());
    }
}
