package lt.code.academy.repeat.modificator;
// Private is didziosios raides nera gera praktika!!!!!!

public class A {

    // package private
    void firstMethod () {
        System.out.println("firstMethod");
    }

    public void secondMethod(){
        System.out.println("secondOne");
    }

    // private metodas apriboja ji ir prie jo prieiti gali TIK TA KLASE
    private void thirdMethod () {
        System.out.println("thirdOne");
    }


}
