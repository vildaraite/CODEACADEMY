package lt.code.academy;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class StudentAnswers {

    private static final String FILE_NAME = "student_answers.json";
    private final ObjectMapper objectMapper;

    public StudentAnswers(ObjectMapper objectMapper) {
    this.objectMapper = objectMapper;
    }

    private List<Student> student (int count) {
        List<Student> students = new ArrayList<>();


        for(int i = 0; i < count; i++) {
            Student student = new Student();
            new Student(student.getName(), student.getSurname(), student.getID())
        }
    }
}
