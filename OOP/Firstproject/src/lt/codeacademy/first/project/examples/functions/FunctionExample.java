package lt.codeacademy.first.project.examples.functions;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionExample {
    public static void main(String[] args) {

        // Supplier -> nepriema parametru grazina rezultata
        Supplier<Integer> supplier = () -> 50;

        //nereikai return jei yra viena eilute kodo
		/*Supplier<Integer> supplier = () -> {
			int number = 50;
			return number;
		};*/

        System.out.println(supplier.get());

        FunctionExample functionExample = new FunctionExample();
        functionExample.testSupplier(supplier);
        functionExample.testSupplier(() -> 60);

        // prima, bet negrazina
        Consumer<String> consumer = value -> System.out.println(value.toUpperCase());
        consumer.accept("Andrius");
        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("Nauja reiksme");

        // ir priima ir grazina, apjungia abieju savybes
        Function<String, Integer> function = text -> text.length() * 10;
        int result = function.apply("Testukas");
        System.out.println("result -> " + result);

        Predicate<String> predicate = text -> text != null && !text.isBlank() && text.startsWith("test");

        if(predicate.test("testukas")) {
            System.out.println("Tesinga");
        } else {
            System.out.println("Neteisinga");
        }

        // abu lygiai tokie pat, tik intconsumeris apriboja ji turet tik inta
        IntConsumer intConsumer = System.out::println;
        Consumer<Integer> secondIntConsumer = System.out::println;
        intConsumer.accept(5000);
        secondIntConsumer.accept(50000);

        BiConsumer<String, Integer> biConsumer = (val1, val2) -> System.out.printf("%s -> %s%n", val1, val2);
        biConsumer.accept("Reiksme yra", 500);

        BiPredicate<String, String> biPredicate = (text1, text2) -> text1!= null && text1.equals(text2);
        System.out.println(biPredicate.test(null, "test"));
        System.out.println(biPredicate.test("test", "test"));

        BiFunction<Integer, Integer, String> biFunction = (numb1, numb2) -> String.valueOf(numb1 * numb2);
        String val = biFunction.apply(50, 20);
        System.out.println(val);

        TripleIntConsumer tripleIntConsumer = (a, b, c) -> System.out.println(a + b + c);
        tripleIntConsumer.triple(50,10, 50);

        // per objecto sculpa, kvieciam metoda ir interfeiso metoda
        functionExample.getTripleIntConsumer().triple(50, 700, 40);
        TripleIntConsumer tripleIntConsumer1 = functionExample.getTripleIntConsumer();
        functionExample.testTripleConsumer(tripleIntConsumer1);
        // tiesioginis iskvietimas
        functionExample.testTripleConsumer((a, b, c) -> System.out.println(a * b *c / 2));
        // same
        functionExample.testTripleConsumer((a, b, c) -> System.out.println(a * b * c * 10));

/*		BiFunction<Integer, Integer, Integer> sum = (a, b) -> {
			int sumResult = functionExample.sum(a, b);
			return sumResult;
		};*/

        // ir virsuj ir apacioj tas pats, nuoroda apacioj i runkcija (:: - nuoroda) jeigu tipai tinka, tada paduodam nuoroda i tipa
        // mes jo nekvieciam, mes paduodame nuoroda
        BiFunction<Integer, Integer, Integer> sum = functionExample :: sum;
        System.out.println(sum.apply(50, 60));
    }

    private int sum(int a, int b) {
        return a + b;
    }

    private void testSupplier(Supplier<Integer> supplier) {
        System.out.println(supplier.get());
    }

    private TripleIntConsumer getTripleIntConsumer() {
        return (a, b, c) -> System.out.println( a * c - b);
    }

    // metodas su naujom reiksmemis
    private void testTripleConsumer(TripleIntConsumer tripleIntConsumer) {
        tripleIntConsumer.triple(50, 10 ,70);
    }
}