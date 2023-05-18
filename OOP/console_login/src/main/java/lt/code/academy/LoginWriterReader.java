package lt.code.academy;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class LoginWriterReader {
    private static final String FILE_NAME = "users.txt";

    Map<String, User> getUsers() {
        Map<String, User> users = new HashMap<>();
        try (ObjectInput oi = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            while(true) {
                User user = (User) oi.readObject();
                users.put(user.userName(), user);
            }
        }catch(EOFException e) {
            // failas nuskaitytas
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        return users;
    }

    void saveUsers(Map<String, User> users) {
        try (ObjectOutput ob = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            for(User user: users.values()) {
                ob.writeObject(user);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}