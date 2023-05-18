package lt.code.academy.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class CorrectAnswer implements Serializable {

        int question;

        String answer;



        public CorrectAnswer() {
        }

        public CorrectAnswer(int question, String answer) {
                this.question = question;
                this.answer = answer;
        }

        public CorrectAnswer(int question, String answer, List<CorrectAnswer> correctAnswers) {
                this.question = question;
                this.answer = answer;
                //this.correctAnswer = correctAnswers;
        }

        public <E> CorrectAnswer(List<E> es) {
        }
}


