package lt.code.academy;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.ArgumentMatchers.*;

import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class WriterServiceTest {

    @Mock
    private ObjectMapper objectMapper;

    private WriterService service;

    @BeforeEach
    void setUp() throws IOException {
        service = new WriterService();
        service.setObjectMapper(objectMapper);
    }

    @AfterEach
    void cleanUp() {
        File file = new File("test.json");
        if(file.exists()){
            file.delete();
        }
    }

    @Test
    void testWriteFileWhenFileNotExist() {
        service.setFileName("test.json");
        assertThrows(FileNotFoundException.class, () -> service.writeToFile(null));
    }

    @Test
    void testWriteFileWhenCannotWriteToFile() throws IOException {
        createFile();
        service.setFileName("test.json");

        User user = new User("Andrius", "B");
        doThrow(IOException.class).when(objectMapper).writeValue(any(File.class), eq(user));

        assertThrows(IOException.class, () -> service.writeToFile(user));
    }

    @Test
    void testWriteFile() throws IOException {
        createFile();
        service.setFileName("test.json");

        User user = new User("Andrius", "B");
        service.writeToFile(user);

        verify(objectMapper, times(1)).writeValue(any(File.class), eq(user));
    }

    private void createFile() throws IOException {
        File file = new File("test.json");
        if(!file.exists()){
            file.createNewFile();
        }
    }
}