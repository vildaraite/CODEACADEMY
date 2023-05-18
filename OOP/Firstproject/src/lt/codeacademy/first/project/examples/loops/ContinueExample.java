package lt.codeacademy.first.project.examples.loops;

public class ContinueExample {
    public static void main(String[] args) {
        int[] mas = {2, 5, 8, 7, 4, 5, 8, 7};

        for(int i = 0; i < mas.length; i++){
            if(mas[i] <= 5) {
                continue;
            }
            System.out.println(mas[i]);
        }
    }
}
