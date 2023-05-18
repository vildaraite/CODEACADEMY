package lt.codeacademy.first.project.examples.scanner.tasks;
/*
Pradinis žodis "Namas".
Naudojant String metodus išvesti į ekraną:""Namai"
"NAMAI"
"MA"
"MAma"
"MAna"
"2"
Eilučių keitimo seka:
"Namas" -> "Namai""Namai" -> "NAMAI"
"NAMAI" -> "MA""MA" -> "MAma"
"MAma" -> "MAna""MAna" -> "2"
 */

public class SixthTask {
    public static void main(String[] args) {
        String text = "Namas";

        SixthTask task = new SixthTask();
        task.changeText(text);
    }
    private void changeText(String text) {
        //      "Namas" -> "Namai"

        String newText = text.replace("s", "i");
        System.out.printf("%s -> %s%n", text, newText);

        //"Namai" -> "NAMAI"
        text = newText;
        newText = newText.toUpperCase();
        System.out.printf("%s -> %s%n", text, newText);

        //"NAMAI" -> "MA"
        text = newText;
        newText = newText.substring(2, 4);
        System.out.printf("%s -> %s%n", text, newText);

        //"MA" -> "MAma"
        text = newText;
        newText += newText.toLowerCase();
        System.out.printf("%s -> %s%n", text, newText);

        //"MAma" -> "MAna"
        text = newText;
        newText = newText.replace("m", "n");
        System.out.printf("%s -> %s%n", text, newText);

        //"MAna" -> "2"
        System.out.printf("%s -> %s%n", newText, newText.indexOf("n") );
    }
}
