package lt.code.academy.repeat.check;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        if(a < b) {
            System.out.println("yra maziau");
        }

        if(a > b || b < 30) {
            System.out.println("tenkina");
        }

        /**
         *  true && true = true
         *  true && false = false
         *  false && true = false
         *
         *  true || true = true
         *  true || false = true
         *  false || true = true
         *  false || false = false
         */

        if(a > b) {
            System.out.println("a daugiau");
        } else {
            System.out.println("b yra daugiau");
        }

        if(a > b) {

        } else if (b < 20) {

        } else if (b < 30) {

        } else  {

        }

        switch(a) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            case 4 -> System.out.println("4");
            default -> System.out.println("nera");
        }
    }
}