package lt.code.academy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lt.code.academy.data.CorrectAnswer;
import lt.code.academy.data.Exam;
import lt.code.academy.data.Student;

import java.io.File;

public class EqualResult {

    private static String FILE_CORRECT = "JsonFiles\\CorrectExamAnswer\\correct_answers_test_file.json";
    private static String STUDENT_ONE_ANSWER = "JsonFiles\\studentAnswerCatalogue\\student_one_answer.json";

    public static void main(String[] args) throws JsonProcessingException {



        ObjectMapper mapper = new ObjectMapper();

        CorrectAnswer a = mapper.readValue(FILE_CORRECT, CorrectAnswer.class);
        Student b = mapper.readValue(STUDENT_ONE_ANSWER, Student.class);

        System.out.println(a);

    }

}
