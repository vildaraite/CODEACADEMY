package lt.code.acadamy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.PushbackInputStream;

public class MainCustomUserSerializer {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        SimpleModule module = new SimpleModule();
        module.addSerializer(User.class, new UserSerializer());

        objectMapper.registerModule(module);

        User user = new User("Vilda", "Beizaraite", "beizaraite@gmail.com", 0);
        String json = objectMapper.writeValueAsString(user);

        System.out.println(json);
    }
}
