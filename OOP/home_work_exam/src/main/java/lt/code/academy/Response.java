package lt.code.academy;

public class Response extends Request{
    private String examAnswer;


    public Response(String examQuestion, String examAnswer) {
        super(examQuestion);
        this.examAnswer = examAnswer;
    }

    public Response(String examQuestion) {
        super(examQuestion);
    }

    public String getExamAnswer() {
        return examAnswer;
    }

    public void setExamAnswer(String examAnswer) {
        this.examAnswer = examAnswer;
    }

    @Override
    public String toString() {
        return "Response{" +
                "examAnswer='" + examAnswer + '\'' +
                '}';
    }
}
