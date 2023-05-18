package lt.codeacademy.first.project.examples.collection.set;

import java.util.*;

// setai unikalus tuo, kad saugo tik unikalius irasus, nebus pasikartojanciu irasu
// nuo listu skiriasi tiek, kad unikalus elementai
// hashsetas - nera aiskaus rikiavimo aloritmo
// linkedhashsetas - grazina ta pacia tvarka kuria mes sudejome i lista
// treeset - grazina pagal abeceles tvarka, didejimo tvarka ir unikalias reiksmes
// norint ideti objekta i seta, override'inam equals ir hashcode savo objekte, tam kad nedetu vienodu reiksmiu
public class SetExample {
    public static void main(String[] args) {
        SetExample example = new SetExample();

        example.hashSetExample();
        example.linkedHashSetExample();
        example.treeSetExample();

    }

    private void hashSetExample(){
        Set<String> names = new HashSet<>();
        // hashsetas - grazina bet kokia tvarka isrikiuotus elementus
        // taciau vis tiek tik unikalias reiksmes, tu paciu nespausdins
        names.add("Vilda");
        names.add("Dzesika");
        names.add("Vaziuotoja");
        names.add("Gazuotoja");
        names.add("Irena");
        names.add("Vilda");

        names.forEach(System.out::println);
        System.out.println(names.contains("Vilda"));
        System.out.println(names.size());
        System.out.println(names.isEmpty());

        Set<Cat> cats = new HashSet<>();
        // cia gausim abudu pukius, nes jis nezino kaip patikrinti
        // ar tokia reiksme jau yra ar ne, negali patikrint pries spausdinant
        // cat klaseje yra pridetas equals ir hashas
        // jei norime, kad sitie listai musu objekte saugotu unikalias reiksmes - overaidiname
        cats.add(new Cat("Pukis", 16));
        cats.add(new Cat("Murkis", 3));
        cats.add(new Cat("Grantas", 18));
        cats.add(new Cat("Pukis", 16));


        cats.forEach(System.out::println);

    }

    private void linkedHashSetExample(){
        Set<String> cars = new LinkedHashSet<>();
        // loinkedhashsetas, grazina unikalias, grazina lygiai taip pat kaip mes ir sudejome
        // lygiai tokia pat tvarka kaip sudedama
        cars.add("BMW");
        cars.add("AUDI");
        cars.add("FORD");
        cars.add("AUDI");
        cars.add("KARVE");
    }

    private void treeSetExample () {
        // skliaustuose po new treeset - pavyzdys kaip sukonvertuoti, kad atvirkciai surasytu mums reiksmes
        Set<Integer> numbers = new TreeSet<>(Collections.reverseOrder());
        // jeigu mums reikia, kad reiksmes butu surikiuotos naudojam treeset
        numbers.add(9);
        numbers.add(7);
        numbers.add(56);
        numbers.add(45);
        numbers.add(4);
        numbers.add(32);

        numbers.forEach(System.out::println);

        Set<Cat> cats = new TreeSet<>();
        cats.add(new Cat("Dzimis", 6));
        cats.add(new Cat("Vikrius", 9));
        cats.add(new Cat("Pupsis", 16));
        cats.add(new Cat("Dzimis", 6));
        cats.add(new Cat("Kudlius", 6));

        cats.forEach(System.out::println);
    }
}
