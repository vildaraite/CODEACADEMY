package lt.codeacademy.first.project.examples.inheritance.extend;

public class Parent {
    public void print(){
        System.out.println("Sveiki salos gyventojai");
    }

    public int sum (int a, int b) {
        return a + b;
    }

    protected void secondPrint(){
        System.out.println("Second print");
    }

    private void thirdPrint(){
        System.out.println("Third print");
    }
}
