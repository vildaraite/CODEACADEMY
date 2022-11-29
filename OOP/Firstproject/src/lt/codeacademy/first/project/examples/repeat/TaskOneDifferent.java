package lt.codeacademy.first.project.examples.repeat;

public class TaskOneDifferent {
    // pasiduodam argumentus per dropdowna, edit configuration, toks pats pavyzdys, kaip ir TASKFOURTHDIFFERENT
    public static void main(String[] args) {
        String arg = args[0]; //"aaaaa"

        int x = Integer.parseInt(arg);

        int result = 9 * x + 18 - 10 * 3 * x;

        System.out.println("Rezultatas: " + result);
    }
}
