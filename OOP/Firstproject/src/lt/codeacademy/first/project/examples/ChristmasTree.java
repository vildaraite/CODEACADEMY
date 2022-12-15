package lt.codeacademy.first.project.examples;


public class ChristmasTree {
    public static void main(String[] args) {

        var line = 1;
        for (var i = 9; i > 0; i--){
            System.out.println(" ".repeat(i) + "*".repeat(line) + " ".repeat(i));
            line += 2;
        }
    }
}
