package lt.codeacademy.first.project.examples.functions;

@FunctionalInterface
interface MyFunction {
    String sayHi(String text);
}

//Viasada naudokite @FunctionalInterface annotaticja jei tai funkcinis interfeisas!
interface MyNonFunction {
    String sayHi(String text);

    //String anotherMethod(String value);
}

public class FunctionMethodReference {
    public static void main(String[] args) {
        FunctionMethodReference reference = new FunctionMethodReference();
        MyFunction myFunction = reference::myStringMethod;
        MyNonFunction myNonFunction = reference::myStringMethod;

        System.out.println(myFunction.sayHi("Labas"));
        System.out.println(myNonFunction.sayHi("Labas non function"));

        //MyFunction mySecondFunction = text -> text.toUpperCase();
        MyFunction mySecondFunction = String::toUpperCase;
        System.out.println(mySecondFunction.sayHi("Petras"));

    }

    private String myStringMethod(String text) {
        return "My String method " + text;
    }
}