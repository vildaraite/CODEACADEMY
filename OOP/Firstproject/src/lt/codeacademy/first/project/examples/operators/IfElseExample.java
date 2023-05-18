package lt.codeacademy.first.project.examples.operators;

public class IfElseExample {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 6;

        // boolean isTrue = a < b; - galim prisiskirti booleana
        //rekomendacija visada su IF rasyti skliaustus, net esant vienam sakiniui
        // && jei pirmas falsas, nebe tikrins nieko
        if(a < b && b > c && a < c) {
            System.out.println("Teisingai");
            System.out.println("Ar gerai bus cia?");
        }

        boolean isTrue = a < b;
        if(isTrue){
            System.out.println("Taip teisingai:");
        }


        // sukuriam objekta, kad galetumem issikviesti metoda
        IfElseExample example = new IfElseExample();
        //per objekta.metodo varda issikvieciam metoda
        if(example.isNumberBigger(a)){
            System.out.println("Taip didesnis");
        }

        // pagal paduotas reiksmes matome, kad bus maziau, todel neispausdins "taip daugiau" - false, eis prie elso
        // ir isspausdins "ne maziau"
        if(a > b) {
            System.out.println("Taip daugiau");
        } else {
            System.out.println("Ne maziau");
        }

        // ir ne daugiau IF'u, del pacios saves ir kuo maziau pasimetimo (2 - max)
        if(a > b){
            if( b > a){
            }
        }

        // jeigu IF ESLSO blocke pirma salyga, kuri tenkina, nesvarbu, kad sekancios tenkina
        // jis nebeziuri i jas, iseina
        if(a > b){
            System.out.println(" a > b");
        } else if (b > c) {
            System.out.println(" b > c");
        } else if (c > a ) {
            System.out.println("c > a");
        } else {
            System.out.println("Nieko neradome");
        }

        // SWITCH'as - naudojami, kai atsiranda konstantos ir jas reikia patikrint
        // nepamirst isideti break'u - svarbu, jis reikalingas, kad nekeliautu per visa programa
        // default - jei nei vieno caso nera, atlieku defaultini

        switch (a){
            case 10:
                System.out.println("a yra 10");
                break;
            case 9:
                System.out.println("a yra 9");
                break;
            case 5:
                System.out.println("a yra 5");
            default:
                System.out.println("a neatitiko jokios reiksmes");
                break;
        }

        // naujesnis SWITCH'as, by default kiekvienas case'as turi break'a, kurie nera parasyti
        // anksciau galima buvo isvengti, tai naudinga isvengti, jei noriu, kad reiksme atliktu du veiksmus
        // nuo JDK 14
        switch (a) {
            case 10 -> {
                System.out.println("a yra 10");
            }
            case 9 -> {
                System.out.println("a yra 9");
                System.out.println("a yra 5");
            }
            case 5 -> System.out.println("a yra 5");
            default -> System.out.println("a neatitiko jokios reiksmes");
        }

        // IF-ELSE vienoje eiluteje
        // kintamasis = salyga   ?  rezultatasJeiTaip :  rezultatasJeiNe
        // trinaris patikrinimas
        int number = a>= b ? 100 : 50;

        //tas pats virs komentaro ir apacioj komentaro

        if (a >+ b) {
            number = 100;
        }else {
            number = 50;
        }


    }

    private boolean isNumberBigger(int a){
        return a > 50;
    }
}
