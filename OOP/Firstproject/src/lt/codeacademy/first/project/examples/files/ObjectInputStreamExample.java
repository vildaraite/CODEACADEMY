package lt.codeacademy.first.project.examples.files;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    public static void main(String[] args) {
        try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream("object_output.txt"))) {
            Person person;
            while((person = (Person) oi.readObject()) != null) {
                System.out.println(person);
            }
            //Sita klaida bus metama visada kai failas su objektai bus buskaitytas
        } catch(EOFException ex) {
        } catch(Exception e) {
            System.out.println("Cannot read file: " + e.getMessage());
        }
    }
}