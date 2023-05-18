package lt.code.academy;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lt.code.academy.data.CorrectAnswer;
import lt.code.academy.data.Exam;
import lt.code.academy.data.Student;
import lt.code.academy.data.StudentAnswer;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Help {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);


        File file = new File("JsonFiles\\studentAnswerCatalogue\\student_answer.json");
        if (!file.exists()) {
            file.createNewFile();


            //mapper.writeValue(file, student);


            // Exam exam = new Exam(111, "english", "grammar", new CorrectAnswer(1, "A"), new CorrectAnswer(2, "C"), new CorrectAnswer(3, "B"), new CorrectAnswer(4, "B"), new CorrectAnswer(5, "A"));

            //File file = new File("student.json");
            if (!file.exists()) {
                file.createNewFile();

                // mapper.writeValue(file, student);


            }
        }
    }
}

