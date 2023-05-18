package lt.codeacademy.first.project.examples.exeptions;

public class CustomRuntimeException extends RuntimeException {
    private final String name;

    public CustomRuntimeException(String name) {
        this.name = name;
    }

    public CustomRuntimeException(String message, String name) {
        super(message);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}