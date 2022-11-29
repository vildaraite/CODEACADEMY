package lt.codeacademy.first.project.examples;

import lt.codeacademy.first.project.examples.data.Person;
import lt.codeacademy.first.project.examples.repeat.Cat;

public class ConstructorExamples {
    public ConstructorExamples(){
        //inscenizuojamos reiksmes, paduodami parametrai, kazkokia paduodama logika pries pradedant programa
        //paruosiamieji darbai, kazka nuskaityti, kazka sukurti
        //pasiruosimai programos darbui
        //konstruktoriu gali buti n, svarbiausia, kad skirtusi, patenkindami overloadingo principa
        // desinys klavisas, generate -> constructor - jei nera
        // konstruktorius gali kviesti kita konstruktoriu su zodeliu THIS
        //konstruktorius kvieciamas tada, kai kuriamas klases objektas
        // juose atliekami pasiruosimo darbai, atleiekami duomenu priskyrimai ir t.t., pasiruosimo darbai pries programos pradejima
        // konstruktorius kaip klase, tuo pacviu vardu, jis nieko negrazina, konstruktoriu gali buti n, svarbiausia, kad dengtu overloadingo principu jie
        //kiekviena klase turi defaultini konstruktoriu, konstruktorius kvieciamas, kai yra kuriamas objektas klaseje
        // konstruktoriai reikalingi atlikti pasiruosimo darbus
        this(78);
    }
    public ConstructorExamples(int a){
        this("mano vardas nuostabus");
        System.out.println(a);

    }
    public ConstructorExamples (String text){

    }

    public static void main(String[] args) {
// int - kintamojo tipas, a - kintamojo vardas, = 10  - kintamojo reiksme
        int a = 10;
        // jei kuriam kazkokios klases objekta - 99,9 proc bus klases vardas tik is mazosios raides
        // ConstructorExamples kintamojo tipas, vardas ir po lygu reiksme - apacioj
        ConstructorExamples constructorExamples = new ConstructorExamples();

        Person person = new Person("Kajus", 56);
        Person secondPerson = new Person("Dangirdas", 28);
// TADA SITU NEREIKIA, JEI per parametrus nustateme objekto
        //person.setAge(25);
        //person.setName("Vilda");

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person);

        System.out.println(secondPerson.getName());
        System.out.println(secondPerson.getAge());
        System.out.println(secondPerson);

       Cat cat = new Cat("Pukis", "bengal");
        System.out.println(cat.name());
        System.out.println(cat.kind());
    }

}
