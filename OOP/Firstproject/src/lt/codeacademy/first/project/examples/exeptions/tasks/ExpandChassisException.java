package lt.codeacademy.first.project.examples.exeptions.tasks;

public class ExpandChassisException extends Exception {

    private final String reason;

    public ExpandChassisException(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }
}
