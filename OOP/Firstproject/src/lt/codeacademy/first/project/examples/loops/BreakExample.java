package lt.codeacademy.first.project.examples.loops;

public class BreakExample {
    public static void main(String[] args) {
        int[] mas = {8,7,6,8,5,11};
        
        int numb = 0;
        for(int i = 0; i < mas.length; i++) {
            if(mas[i] == 5) {
                numb = mas[i];
                break;
            }
            System.out.println(mas[1]);
        }
        if(numb > 0) {
            System.out.println("Rezultatas" + numb);
        }
    }
}
