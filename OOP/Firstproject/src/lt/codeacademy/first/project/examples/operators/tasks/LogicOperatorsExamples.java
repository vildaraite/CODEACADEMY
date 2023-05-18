package lt.codeacademy.first.project.examples.operators.tasks;

public class LogicOperatorsExamples {
    public static void main(String[] args) {

        boolean first = true;
        boolean second = false;

        // su ! yra not
        System.out.println(!first);
        // nelygus
        System.out.println(first && second);
        // jei pirma puse true - antros netikrins, bet kadangi pirma buvo false, patikrino ir kita
        System.out.println(second || first );
        // antros puses netikrina, jei pirmoji yra false
        System.out.println(first && !second);
    }
}
