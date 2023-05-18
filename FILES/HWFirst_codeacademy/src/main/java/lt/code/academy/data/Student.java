package lt.code.academy.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


public class Student implements Serializable {

    private int id;

    private String name;

    private String surname;

    private Exam exam;

    private List<StudentAnswer> studentAnswers;


    public Student() {
    }

    public Student(int id, String name, String surname, Exam exam, List<StudentAnswer> studentAnswers) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.exam = exam;
        this.studentAnswers = studentAnswers;
    }

    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", exam=" + exam +
                ", studentAnswers=" + studentAnswers +
                '}';
    }
}

