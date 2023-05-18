package lt.code.academy.data;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.List;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Exam implements Serializable{


    private int id;

    private String subject;

    private String type;

    //private LocalDateTime examDate;

    private List<CorrectAnswer> correctAnswerList;

    StudentResult result;



    public Exam(int id, String subject, String type) {
        this.id = id;
        this.subject = subject;
        this.type = type;
        this.correctAnswerList = correctAnswerList;
        this.result = result;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", type='" + type + '\'' +
                ", correctAnswerList=" + correctAnswerList +
                ", result=" + result +
                '}';
    }
}





