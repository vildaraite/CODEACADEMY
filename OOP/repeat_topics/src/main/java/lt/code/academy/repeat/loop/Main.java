package lt.code.academy.repeat.loop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //mas
        int[] mas = new int[10];
        int mas1[] = new int[10];
        int[] mas2 = {1,2,5,6,3};

        mas[0] = 10;
        int value = mas[0];

        mas[2] = 0;
        for(int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        value = numbers.get(0);

        int size = numbers.size();
        boolean isExist = numbers.contains(20); //false

        Set<User> users = new HashSet<>();
        users.add(new User(1));
        users.add(new User(2));
        users.add(new User(1));

        for(User user: users) {
            System.out.println(user.getId());
        }

        users.forEach(u -> System.out.println(u.getId()));

        Map<Integer, String> values = new HashMap<>();
        values.put(1, "kazkas");

        String result = values.get(1);

        /*
         * Array [] -> tik tada kai zinom tikslu nekintama ilgi
         * List -> kai reikia saugoti visus elementus nesavarbu ar kartojasi ar ne
         * Set -> tik unikalias reiksmes
         * Map -> saugome poromis key unikalus value gali kartotis
         *
         * */


    }
}