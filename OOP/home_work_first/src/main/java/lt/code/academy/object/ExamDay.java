package lt.code.academy.object;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lt.code.academy.object.Exam;
import lt.code.academy.object.Student;
import lt.code.academy.object.StudentAnswer;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class ExamDay {

    // objektas kuriame yra viskas surasyta, ir studentas, ir jo egzaminas ir jo atsakymai ir data, kada laike
    private Student student;

    private Exam exam;

    private List<StudentAnswer> studentAnswers;

    private String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());



}
