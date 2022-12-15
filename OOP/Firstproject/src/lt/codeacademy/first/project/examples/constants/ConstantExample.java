package lt.codeacademy.first.project.examples.constants;

public class ConstantExample {
    private static final String DEVELOPER_NAME = "WILDA";
    private static final String MONDAY = "Monday";

    public static void main(String[] args) {
        System.out.println(MONDAY);
        System.out.println(Week.MONDAY.getName());
        System.out.println(Week.TUESDAY.getNumb());
    }
}
