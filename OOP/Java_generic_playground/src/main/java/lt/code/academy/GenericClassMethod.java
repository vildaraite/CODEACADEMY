package lt.code.academy;

import java.util.ArrayList;
import java.util.List;

public class GenericClassMethod <E> {

    void myFirstGenericMethod(E e) {
        System.out.println(e);
    }

    void mySecondGenericMethod(E e, E e1) {
        System.out.println(e);
        System.out.println(e1);
    }

    List<E> myThirdGenericMethod(List<E> list, List<E> secondList) {
        List<E> newList = new ArrayList<>(list);
        newList.addAll(secondList);

        return newList;
    }
}