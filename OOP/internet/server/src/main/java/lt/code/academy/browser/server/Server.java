package lt.code.academy.browser.server;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lt.code.academy.company.generator.GenerateService;
import lt.code.academy.company.generator.data.Company;
import lt.code.academy.browser.Helper;
import lt.code.academy.browser.Request;
import lt.code.academy.browser.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.function.Function;

public class Server {
    private static final Logger LOG = LogManager.getLogger(Server.class);
    private List<Company> companies;

    public static void main(String[] args) {
        Server server = new Server();

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        server.initCompanies(mapper);
        while(true){
            server.writeResponse(mapper);
            try {
                Thread.sleep(2000);
            }
            catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void writeResponse(ObjectMapper objectMapper) {
        Helper helper = new Helper(objectMapper);

        Request request = getRequest(objectMapper, helper);
        LOG.info("Request data: {}", request);

        for(Company company: companies) {
            if(company.getCode().equals(request.getCompanyCode())) {
                Response response = new Response(company.getCode(), company.getName(), company.getAverageOfSalary());
                helper.writeToJson(Helper.RESPONSE_FILE_NAME, response);
                break;
            }
        }
    }

    private Request getRequest(ObjectMapper mapper, Helper helper) {
        Function<File, Request> requestFunction = requestFunction(mapper);

        return helper.getResponseFromClient(Helper.REQUEST_FILE_NAME, requestFunction);
    }

    private void initCompanies(ObjectMapper mapper) {
        GenerateService service = new GenerateService(mapper);
        service.createRandCompaniesFile(100);

        try {
            companies = mapper.readValue(service.getFile(), new TypeReference<>() {});
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private Function<File, Request> requestFunction(ObjectMapper mapper) {
        return file -> {
            try {
                return mapper.readValue(file, Request.class);
            }
            catch(IOException e) {
                throw new RuntimeException(e);
            }
        };
    }
}