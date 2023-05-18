package lt.codeacademy.first.project.examples.string;

public class StringFormatExample {
    public static void main(String[] args) {
        String name = "Petriukas";
        String surname = "Varliukas";
        int age = 69;
        float height = 1.9333f;

        String text = String.format("Asmens identidikavimas: %s %s, amzius %d m. ir jo ugis yra %.2fm.", name, surname, age, height);
        System.out.println(text);

        // KADA NAUDOJAME? naudojame tada: kai norime sulygiuoti viska
        text = String.format("|%20s|%n|%20s|%n|%-20s|", "as", "tikrai", "hihihaha");

    }
}
