package lt.code.acadamy;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class UserDeserializer extends StdDeserializer<User> {

    protected UserDeserializer() {
        super(User.class);
    }

    @Override
    public User deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {


        return null;
    }

}
