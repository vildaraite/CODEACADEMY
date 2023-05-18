package lt.code.academy.company.generator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import lt.code.academy.company.generator.data.Company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateService {

    private static final String FILE_NAME = "companies.json";

    private final ObjectMapper objectMapper;

    public GenerateService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public void createRandCompaniesFile(int count) {
        List<Company> companies = generate(count);

        File file = getFile();
        if(file == null) {
            return;
        }

        try {
            objectMapper.writeValue(file, companies);
        }
        catch(IOException e) {
            System.out.println("Cannot write to file");
        }
    }

    private List<Company> generate(int count) {
        List<Company> companies = new ArrayList<>();
        Faker faker = new Faker();
        Random random = new Random();

        for(int i = 0; i < count; i ++) {
            com.github.javafaker.Company fakerCompany = faker.company();
            Company company = new Company(fakerCompany.name(), fakerCompany.bs(), random.nextInt(count),  random.nextDouble(count) + 1000);
            companies.add(company);
        }

        return companies;
    }

    private File getFile() {
        try {
            File file = new File(FILE_NAME);
            if(!file.exists()) {
                file.createNewFile();
            }

            return file;
        }catch(IOException e) {
            System.out.println("Cannot create file " + FILE_NAME);
        }

        return null;
    }
}