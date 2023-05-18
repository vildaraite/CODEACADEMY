package lt.code.academy.company.generator;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        GenerateService service = new GenerateService(objectMapper);
        service.createRandCompaniesFile(120);
    }
}