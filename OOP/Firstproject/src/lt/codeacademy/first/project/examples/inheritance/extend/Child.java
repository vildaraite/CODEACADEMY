package lt.codeacademy.first.project.examples.inheritance.extend;

// su zodeliu extends nusakome, kad vaikine klase paveldi tevine klase ir nurodome jos pavadinima
public class Child extends Parent {


    public static void main(String[] args) {
        Child child = new Child();
        child.print();
        child.secondPrint();
        // child.thirdPrint neprieiname, nes jis yra private ir jis prieinamas tik toje klaseje, nors ir yra vaikine tevine klases
        ((Child)child).test(); // uzkestinimas ir tada galime prieiti prie test, downcastinimas - bet GERIAU VISUR RASYTI VAIKINE KLASE

        System.out.println(child.sum(50, 100));
    }

    private void test (){
        System.out.println("Test");
    }

    @Override
    public void print(){
        // super reiskia kad imam tevines klases metodus
        // this sako kad imame sios klases
        super.print();

    }

    @Override
    public int sum(int a, int b){
        return super.sum(a, b) * 5;
    }
}
