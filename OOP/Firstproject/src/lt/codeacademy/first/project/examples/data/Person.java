package lt.codeacademy.first.project.examples.data;

public class Person {
// pojo arba beansai yra klase, kuri MUMS SAUGO KINTAMUOSIUS
    private String name;
    private int age;
// SIUO KONSTRUKTORIUMI mes pasakome programai, kad reiksmes yra privalomos
    // pojo klasiu sukurima pariboja, tada jis reikalauja kazkokios ivesties
    //kai yra konstruktorius nebera setteriu getteriu
    //saugus objektas, kuris negali buti pamodifikuotas
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
