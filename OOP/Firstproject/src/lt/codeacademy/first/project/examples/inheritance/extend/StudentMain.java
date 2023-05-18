package lt.codeacademy.first.project.examples.inheritance.extend;

import java.security.spec.RSAOtherPrimeInfo;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Vilda", "Beizaraite", "ID-56789", "VU");
        System.out.println(student.getId());
        System.out.println(student.getUniversity());
        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student); // spausdins tik id ir university, tevines klases info nespausdins

        Person person = new Person("Lukas", "Beizaras");
        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person); // atspausdins tik varda ir pavarde, tik to objekto kas yra

        Person secondPerson = new Student("Simonas", "Beizaras", "ID-56748", "KTU");
        System.out.println(secondPerson.getSurname());
        System.out.println(secondPerson.getName());
        System.out.println(secondPerson);

        System.out.println(((Policeman) secondPerson).getBadgeNumber());

        // instanceof mums padeda prieiti prie secondperson vaikines klases student getid ir get university
        // st yra kintamojo susikurimas
        if(secondPerson instanceof Student st) {
            System.out.println(st.getId());
            System.out.println(st.getUniversity());
        }

        // cia pries tai JDK naudojamas instanceof'as, virsuje tas, kuri mes turime naudoti
        /*if(secondPerson instanceof Student){
            Student st = (Student) secondPerson;
            System.out.println(st.getUniversity());
            System.out.println(st.getId());*/

        Person policeMan = new Policeman("Sveta", "Beizariene", "UK-6575656");

        testPerson(student);
        testPerson(person);
        testPerson(secondPerson);
        testPerson(policeMan);

        }

        private static void testPerson(Person person) {
            System.out.println(person);
            System.out.println(person.getSurname());
            System.out.println(person.getName());

            if (person instanceof Student st) {
                System.out.println(st.getId());
                System.out.println(st.getUniversity());
            }
            if(person instanceof Policeman p) {
                System.out.println(p.getBadgeNumber());
            }

        }

    }

