package lt.code.academy;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WriterService {

    private ObjectMapper objectMapper;
    private String fileName;

	/*public WriterService(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}*/

    public WriterService() throws IOException {
        objectMapper = new ObjectMapper();
        fileName = "goodFile.json";
        File file = new File(fileName);
        if(!file.exists()) {
            file.createNewFile();
        }
    }

    public void writeToFile(User user) throws IOException {
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        File file = new File(fileName);
        if(!file.exists()) {
            throw new FileNotFoundException();
        }

        objectMapper.writeValue(file, user);
    }

    public void setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}