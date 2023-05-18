package lt.codeacademy.first.project.examples.files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class ObjectOutputStreamExample {
    public static void main(String[] args) {
        try(ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("object_output.txt"))) {
            ob.writeObject(new Person("Vilda", "Beizaraite", 25));
            ob.writeObject(new Person("Petras", "Petraitis"));
        } catch(IOException e) {
            System.out.println("Cannot write to file: " + e.getMessage());
        }
    }
}
