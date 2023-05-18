package lt.codeacademy.first.project.examples.inheritance.task.storage;

public interface Storage {
    void saveInfo(Info info);
    Info findInfo(int id);
    Info findInfo(String text);
}