package lt.codeacademy.first.project.examples.equals.tasks;



public class TaskEno {
    private static boolean TaskEno;

    public static void main(String[] args) {
        String first = "Vilda";
        String second = "Vilda";

        System.out.println(first == second);
        System.out.println(first.equals(second));
        System.out.println(TaskEno);

        first = new String("Vilda");
        second = new String( "Vilda");
        first = second;
        System.out.println(first = second);
        System.out.println(first.equals(second));
    }

}
