package lt.code.academy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExamInspector {
    public static void main(String[] args) {
        File correctAnswersFile = new File("correct_answers.json");
        Scanner correctAnswersScanner = null;
        try {
            correctAnswersScanner = new Scanner(correctAnswersFile);
        }catch (FileNotFoundException e) {
            System.out.printf("Correct answers file not found, because of %s%n", e.getMessage());
            return;
        }

        File studentAnswerFile = new File("student_answers.json");
        Scanner studentAnswerScanner = null;
        try {
            studentAnswerScanner = new Scanner((studentAnswerFile));
        }catch (FileNotFoundException e) {
            System.out.printf("Student answer file not found, because of %s%n", e.getMessage() );
        }

        int score = 0;
        while(studentAnswerScanner.hasNextLine() && studentAnswerScanner.hasNextLine()){
            String correctAnswer = correctAnswersScanner.nextLine();
            String studentAnswer = studentAnswerScanner.nextLine();
            if(correctAnswer.equals(studentAnswer)){
                score++;
            }
        }

        System.out.printf("Your score is %s%n", score);
    }
}
