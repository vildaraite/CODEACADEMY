package lt.codeacademy.first.project.examples.collection;

import java.util.List;
import java.util.Objects;

public record Question(String question, List<String> answers, int correctAnswer) {

    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }
        if(o == null || getClass() != o.getClass())
        {
            return false;
        }
        Question question1 = (Question) o;
        return correctAnswer == question1.correctAnswer && question.equals(question1.question) && answers.equals(question1.answers);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(question, answers, correctAnswer);
    }
}
