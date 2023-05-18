package lt.code.academy;

import java.util.List;

public class MainGenericClass {
    public static void main(String[] args) {
        GenericClassMethod<Integer> generic = new GenericClassMethod<>();
        generic.myFirstGenericMethod(500);
        //generic.myFirstGenericMethod("500");

        generic.mySecondGenericMethod(50,100);
        //generic.mySecondGenericMethod(50,"100");

        List<Integer> items = generic.myThirdGenericMethod(List.of(5,5,8,7,8), List.of(8,5,79,5));
        System.out.println(items);

        GenericClassMethod<String> generic2 = new GenericClassMethod<>();
        List<String> secondItems = generic2.myThirdGenericMethod(List.of("d", "d"), List.of("43"));
        System.out.println(secondItems);

        GenericCalculator<Integer> calculator = new GenericCalculator<>();
        System.out.println(calculator.sum(500, 600));

        GenericCalculator<Double> calculator2 = new GenericCalculator<>();
        System.out.println(calculator2.sum(500.0, 600.0));

        //GenericCalculator<String> calculator3 = new GenericCalculator<>();

        MainGenericClass main = new MainGenericClass();
        main.genericMethod("test");
        main.genericMethod(3);
        main.genericMethod(false);
        main.genericMethod(500.0);

        main.objectMethod("test");
        main.objectMethod(3);
        main.objectMethod(false);
        main.objectMethod(500.0);

        main.secondGenericMethod(500, 500);
        main.secondGenericMethod(500, "5000");
    }

    private <T> void genericMethod(T t) {

    }

    //Nerekomenduojama, geriau kalses lygio generic !
    private <T> void secondGenericMethod(T t,T t1) {

    }

    private  void objectMethod(Object ob) {

    }

    //TODO continue......
}