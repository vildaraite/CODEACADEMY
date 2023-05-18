import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.stream.Stream;


public class Testing {
    public static void main(String[] args) {
        Stream<String> strem = Stream.of("Go home", "interesting", "SOMETHING", "GOOD Luck");

        String value = strem.map(String::toUpperCase).filter(v -> v.length() > 7).map(v -> v.replace(" ", "_")).max(Comparator.comparingInt(String::length)).orElse(null);

        System.out.println(value);
    }

}

