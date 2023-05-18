package lt.code.academy;

public class CorrectAnswer {

    private int questionNumb;
    private String questionAnswerLetter;

    public CorrectAnswer(int questionNumb, String questionAnswerLetter) {
        this.questionNumb = questionNumb;
        this.questionAnswerLetter = questionAnswerLetter;
    }

    public int getQuestionNumb() {
        return questionNumb;
    }

    public void setQuestionNumb(int questionNumb) {
        this.questionNumb = questionNumb;
    }

    public String getQuestionAnswerLetter() {
        return questionAnswerLetter;
    }

    public void setQuestionAnswerLetter(String questionAnswerLetter) {
        this.questionAnswerLetter = questionAnswerLetter;
    }
}
