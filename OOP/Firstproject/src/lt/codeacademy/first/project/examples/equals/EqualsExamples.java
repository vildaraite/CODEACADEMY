package lt.codeacademy.first.project.examples.equals;

public class EqualsExamples {
    public static void main(String[] args) {
            // primityvius kintamuosius galime palyginti su ==, primityviu negalime palyginti naudodami equals
            int x = 10;
            int y = 12;

            System.out.println("x == y: " + (x == y));

            System.out.println("Integer.compare(x, y): " + Integer.compare(x, y)); // pavyzdys ateiciai

            String text = "Labas";
            String textOne = "Labas";
            String textTwo = new String("Labas");


            System.out.println(System.identityHashCode(text));

            System.out.println(System.identityHashCode(textOne));

            System.out.println("text == textOne: " + (text == textOne)); // TAIP NEDAROME, NES TAI YRA STRINGAS, O STRINGU NELYGINAME SU LYGULYGU
            System.out.println("text == textTwo: " + (text == textTwo)); // taip ir nedarome
            System.out.println("text.equals(textTwo): " + text.equals(textTwo));
        }
    }

