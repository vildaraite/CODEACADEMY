package lt.codeacademy.first.project.examples.inheritance.task.storage;

public class Info {
    private int id;
    private String text;

    public Info(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public boolean isContains(String text) {
        return this.text.contains(text);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}