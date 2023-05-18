package lt.code.academy.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

    private static final String FILE_NAME = "file.json";

    public static void main(String[] args) throws IOException {
        //Student student = new Student(1, "Vilda", "Beizaraite", new Exam(111, "English", "Grammar"), )
    Object object = new Object(new Student(1, "Vilda", "Beizaraite"), new Exam(111, "English", "Grammar"));

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        File file = new File("student.json");
        if(!file.exists()) {
            file.createNewFile();
        }

        mapper.writeValue(file, object);
    }
}
