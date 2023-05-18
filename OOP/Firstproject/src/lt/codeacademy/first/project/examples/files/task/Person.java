package lt.codeacademy.first.project.examples.files.task;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Person {
    private final int id;
    private final String name;
    private final String surname;
    private int receivedMoney;
    private int sentMoney;
    private int countReceivedMoney;
    private int countSentMoney;

    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public int getReceivedMoney() {
        return receivedMoney;
    }

    public void setReceivedMoney(int receivedMoney) {
        this.receivedMoney = receivedMoney;
    }

    public int getSentMoney() {
        return sentMoney;
    }

    public void setSentMoney(int sentMoney) {
        this.sentMoney = sentMoney;
    }

    public void increaseSentMoneyCount() {
        countSentMoney++;
    }

    public void increaseReceivedMoney() {
        countReceivedMoney++;
    }

    public int getCountReceivedMoney() {
        return countReceivedMoney;
    }

    public int getCountSentMoney() {
        return countSentMoney;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %s", id, name, surname, receivedMoney, sentMoney);
    }
}

