package lt.code.academy.repeat.method;

public class Second extends First {
    private int id;

    public Second() {
        this(100);
    }

    public Second(int a) {
        super("new value");
        System.out.println(a);
    }

    public int getId() {
        return id + getValue();
    }

    public void setId(int id) {
        this.id = id;
    }
}