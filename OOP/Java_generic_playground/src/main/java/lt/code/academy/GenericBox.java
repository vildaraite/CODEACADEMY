package lt.code.academy;

public class GenericBox<E> {
    private E e;

    public E getObj() {
        return e;
    }

    public void setObj(E e) {
        this.e = e;
    }
}