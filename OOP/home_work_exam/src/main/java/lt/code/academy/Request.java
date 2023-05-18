package lt.code.academy;

public class Request {
    private String examQuestion;

    public Request(String examQuestion) {
        this.examQuestion = examQuestion;
    }

    public String getExamQuestion() {
        return examQuestion;
    }

    public void setExamQuestion(String examQuestion) {
        this.examQuestion = examQuestion;
    }
}
