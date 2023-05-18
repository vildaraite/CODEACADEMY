package lt.code.academy;
/*

import lt.code.academy.object.Student;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginWriterReader {
    private static final String FILE_NAME = "students.txt";

    List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        try (ObjectInput oi = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            while (true) {
                //Students student =  (Student) oi.readObject();
                //student.
            }
        } catch (EOFException e) {

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    void saveStudents(Map<String, Students> students) {
        try (ObjectOutput ob = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            for(Students student: students.values()) {
                ob.writeObject(student);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}*/
