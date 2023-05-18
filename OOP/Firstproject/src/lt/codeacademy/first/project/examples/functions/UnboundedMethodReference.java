package lt.codeacademy.first.project.examples.functions;
class TestClass {
    public String testMethod(String value) {
        return "Labas testMethod" + value;
    }

    public static String secondTestMethod(String value) {
        return "Second method " + value;
    }
}

interface Transform {
    String transform(TestClass testClass, String value);

    default String testDefaultTransformMethod(String value) {
        return  "transform default value "  + value;
    }
}

interface SecondTransform {
    String getValue(String value);
}

public class UnboundedMethodReference {

    public static void main(String[] args) {
        // 1. nuoroda | referrencas perduodant sukurta deklaracija kvietimo metu
        Transform transform = TestClass::testMethod;
        System.out.println(transform.testDefaultTransformMethod("Test vsalue"));

        TestClass testClass = new TestClass();
        System.out.println(transform.transform(testClass, " Test second value"));
        System.out.println(testClass.testMethod(" example"));

        // 2. nuoroda is sukurto objekto
        SecondTransform secondTransform = testClass::testMethod;
        System.out.println(secondTransform.getValue(" Kazkas naujo???"));

        // 3. nuoroda kai yra statinis metodas
        SecondTransform secondTransform1 = TestClass::secondTestMethod;
        System.out.println(secondTransform1.getValue(":)"));
    }
}