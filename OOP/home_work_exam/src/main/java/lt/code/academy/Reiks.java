package lt.code.academy;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Reiks {
        public static void main(String[] args) throws IOException {


            lt.code.academy.CorrectAnswer ca = new lt.code.academy.CorrectAnswer();
            ObjectMapper mapper = new ObjectMapper();

            File file = new File("correct_answers.json");

            // mapper.writeValue(file, ca.setCorrect());

            if (!file.exists()) {
                file.createNewFile();
            }

        }

        //private Object setCorrect() {
        // Map<Integer, String> correct = new LinkedHashMap<>();

        // correct.put(1, "c");
        // correct.put(2, "b");
        // correct.put(3, "b");
        // correct.put(4, "a");
        //correct.put(5, "c");

    }
