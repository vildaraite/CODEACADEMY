package lt.code.academy.data;

public class Object {
    private Student student;
    private Exam exam;
    private StudentAnswer studentAnswer;

    public Object(Student student, Exam exam, StudentAnswer studentAnswer) {
        this.student = student;
        this.exam = exam;
        this.studentAnswer = studentAnswer;
    }

    public Object(Student student, Exam exam) {
    }

    @Override
    public String toString() {
        return "Object{" +
                "student=" + student +
                ", exam=" + exam +
                ", studentAnswer=" + studentAnswer +
                '}';
    }
}
