package lt.code.academy;

public class GenericCalculator<T extends Number> {

    double sum (T t1, T t2) {
        return t1.doubleValue() + t2.doubleValue();
    }
}