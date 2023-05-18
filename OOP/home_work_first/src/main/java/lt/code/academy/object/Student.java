package lt.code.academy.object;

import java.util.ArrayList;
import java.util.List;

public class Student {

    // studento objektas turintis savyje
    // egzamina ir atsakyma
    private String id;

    private String name;

    private String surname;

    private Exam exam;

    List<StudentAnswer> studentAnswers = new ArrayList<>();

    public Student(String id, String name, String surname, Exam exam){

    }

    private StudentAnswer studentAnswer;

    public Student(String id, String name, String surname, Exam exam, StudentAnswer studentAnswer) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.exam = exam;
        this.studentAnswer = studentAnswer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public StudentAnswer getStudentAnswer() {
        return studentAnswer;
    }

    public void setStudentAnswer(StudentAnswer studentAnswer) {
        this.studentAnswer = studentAnswer;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", exam=" + exam +
                ", studentAnswer=" + studentAnswer +
                '}';
    }
}

