package lt.codeacademy.first.project.examples.functions;

import java.util.function.Function;
import java.util.function.Predicate;

public class CompositionFunctionExample {
    public static void main(String[] args) {
		/*Function<String, String> function = text -> text.substring(8),
				function1 = text -> text.replace("a", "%"),
				function2 = String::toUpperCase,
				function3 = function.compose(function1).andThen(function2);*/

        Function<String, String> function = text -> text.substring(8);
        Function<String, String> function1 = text -> text.replace("a", "%");
        Function<String, String> function2 = String::toUpperCase;
        Function<String, String> function3 = function.compose(function1).andThen(function2);


        String value = function.apply("Mano vardas yra Andrius");
        value = function1.apply(value);
        value = function2.apply(value);
        System.out.println(value);

        System.out.println(function3.apply("Mano vardas yra Andrius"));

        Predicate<String> p = email -> email != null,
                p1 = email -> email.contains("@"),
                p2 = email -> email.endsWith(".com"),
                p3 = email -> email.length() >= 10,
                p4 = p.and(p1).and(p2).and(p3);

		/*boolean test = p.test("test") && p1.test("test");
		Predicate<String> t = p.and(p1);
		boolean test1 = t.test("test");*/

        System.out.println(p4.test(null));
        System.out.println(p4.test("null"));
        System.out.println(p4.test("ab@"));
        System.out.println(p4.test("andriusbaltrunas@.lt"));
        System.out.println(p4.test("andriusbaltrunas@.com"));
    }
}