package lt.code.academy.repeat.modificator;

public class B extends C {

    public void firstBMethod () {
        B b = new B();
        A a = new A();
        a.firstMethod();
        a.secondMethod();

        C c = new C();
    }
}
