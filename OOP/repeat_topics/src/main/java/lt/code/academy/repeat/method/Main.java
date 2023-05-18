package lt.code.academy.repeat.method;

public class Main {
    public static void main(String[] args) {
        Second second = new Second();
        System.out.println(second);
        //second = new Second();
        //System.out.println(second);
        second.setId(10);
        System.out.println(second.getId());

        Main main = new Main();
        main.printMethod(second);

        System.out.println(second.getId());

        int a = 10;
        main.secondMethod(a);
        System.out.println(a);
    }

    private void printMethod(Second second) {
        System.out.println(second);
        second.setId(20);
    }

    private void secondMethod(int a) {
        System.out.println(a);
        a = 20;
    }
}