package lt.code.academy.browser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lt.code.academy.helper.Helper;
import lt.code.academy.helper.data.Request;
import lt.code.academy.helper.data.Response;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.function.Function;

public class Browser {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        Browser browser = new Browser();
        browser.getCompanyCode(mapper);
    }

    private void getCompanyCode(ObjectMapper objectMapper) {
        Scanner scanner = new Scanner(System.in);
        Helper helper = new Helper(objectMapper);

        String companyCode;
        do {
            System.out.println("Iveskite imones koda");
            companyCode = scanner.nextLine();
            if(companyCode.equals("exit")) {
                return;
            }

            helper.writeToJson(Helper.REQUEST_FILE_NAME, new Request(companyCode));

            Function<File, Response> function = getResponseFunction(objectMapper);
            Response response = helper.getResponseFromClient(Helper.RESPONSE_FILE_NAME, function);
            System.out.println(response);

        }while(!companyCode.equals("exit"));
    }

    private Function<File, Response> getResponseFunction(ObjectMapper mapper) {
        return file -> {
            try {
                return mapper.readValue(file, Response.class);
            }
            catch(IOException e) {
                System.out.println(e.getMessage());
            }
            return null;
        };
    }
}