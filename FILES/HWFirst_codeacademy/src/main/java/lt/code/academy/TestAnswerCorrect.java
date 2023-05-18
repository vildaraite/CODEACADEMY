package lt.code.academy;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lt.code.academy.data.CorrectAnswer;
import lt.code.academy.data.Exam;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class TestAnswerCorrect {


    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        //Exam exam = new Exam(111, "English", "Grammar", List.of(new CorrectAnswer(1, "A"), new CorrectAnswer(2, "C"), new CorrectAnswer(3, "B"), new CorrectAnswer(4, "B"), new CorrectAnswer(5, "A")));

        File file = new File("JsonFiles\\CorrectExamAnswer\\correct_answers_test_file.json");
        if (!file.exists()) {
            file.createNewFile();
        }

       // mapper.writeValue(file, exam);
    }
}
