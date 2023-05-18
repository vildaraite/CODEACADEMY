package lt.codeacademy.first.project.examples.inheritance.task;

public class NumberMain {
    public static void main(String[] args) {
        NumberMain numberMain = new NumberMain();

        Number number = new PositiveNumber(200, 20, 50);
        numberMain.run(number);

        Number evenNumb = new EvenNumber(500, 10, 100);
        numberMain.run(evenNumb);

        OddNumber oddNumber = new OddNumber(100, 10, 20);
        numberMain.run(oddNumber);

        NegativeNumber negativeNumber = new NegativeNumber(100, 50, 20);
        numberMain.run(negativeNumber);
    }

    private void run(Number number) {
        number.generate();
        System.out.println("Sum: " + number.sum());
    }
}