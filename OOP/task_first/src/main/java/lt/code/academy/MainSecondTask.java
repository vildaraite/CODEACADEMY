package lt.code.academy;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class MainSecondTask {
    public static void main(String[] args) throws IOException {
        Payment payment = new Payment(new Sender("Vilda", "B"), new Receiver("Lukas", "B"));

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        File file = new File("payment.json");
        if(!file.exists()) {
            file.createNewFile();
        }

        objectMapper.writeValue(file, payment);

        Payment response = objectMapper.readValue(file, Payment.class);
        System.out.println(response);

        String stringLine = objectMapper.writeValueAsString(response);
        System.out.println(stringLine);
    }
}