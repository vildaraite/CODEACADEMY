package lt.code.academy;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.List;

public class Student {

    private String name;
    private String surname;
    private int ID;

    //@JsonProperty ("Egzaminas")
    //List<Exam> exams;

    //List<Answers> answers;




    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    }
