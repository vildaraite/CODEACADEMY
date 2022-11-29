package lt.codeacademy.first.project.examples;

public class NonPrimitiveTypes {
    public static void main(String[] args) {
    // primityvas
        int a = 10; //defaultas = 0
        // neprimityvas, pasiimti is jo nauda, panaudoti kitas klases, pagalbinis metodas
        //VISI PRIMITYVAI TURI PO neprimityvu
        //parse ir valueOf - kurie konvertuoja is STRINGO
        // parseDouble - grazina primityva, tau nereikia kurtis objekto, uzima maziau atminties neprimityvas nei objektas
        // valueOf -
    Integer intA = Integer.parseInt("50"); // default'as null (GALIOJA NEPRIMITYVUOSE)

    float b = 10.0f;
    Float floatB = Float.max(50.0f, 15000f);

    double c = 45.6;
    Double doubleC = Double.parseDouble("5000.90");
    }
}
