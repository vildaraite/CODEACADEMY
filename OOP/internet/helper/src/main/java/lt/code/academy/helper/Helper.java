package lt.code.academy.helper;

import com.fasterxml.jackson.databind.ObjectMapper;
import lt.code.academy.helper.data.Request;
import lt.code.academy.helper.data.Response;

import java.io.File;
import java.io.IOException;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Helper {
    public static final String REQUEST_FILE_NAME = "request.json";
    public static final String RESPONSE_FILE_NAME = "response.json";

    private final ObjectMapper mapper;

    public Helper(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public void writeToJson(String fileName, Request request) {
        try {
            File file = new File(fileName);
            if(!file.exists()) {
                file.createNewFile();
            }

            mapper.writeValue(file, request);

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public <T> T getResponseFromClient(String fileName, Function<File, T> function) {
        File file = new File(fileName);
        int count = 0;
        try {
            while(!file.exists()) {
                System.out.printf("%s Laukiam....%n", count++);
                Thread.sleep(1000);
            }

            T t = function.apply(file);
            file.delete();

            return t;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}