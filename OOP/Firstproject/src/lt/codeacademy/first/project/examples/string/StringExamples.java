package lt.codeacademy.first.project.examples.string;

import java.sql.SQLOutput;

public class StringExamples {
    public static void main(String[] args) {
        // stringo priskyrimas, ir jo spausdinimas
        String text = "Zdarova";
        System.out.println(text);


        // JDK 15, javos didesnis tekstukas, kuris pradedamas trejomis kabutemis
        String stringBlock = """
                Labas Vildele,
                kaip sekasi programinti ?
                Kiek ilgai dar tempsi?
                
                Pagarbiai, as pati :)""";
        System.out.println(stringBlock);



        //metodas CHARAT
        char letter = stringBlock.charAt(12);
        System.out.println(letter);

        //metodas LENGHT
        //raidziu kiekis stringblocke, gal labiau simboliu kiekis
        System.out.println("Raidziu kiekis: " + stringBlock.length());

        // pasiima paskutini simboli is stringblocko
        System.out.println(stringBlock.charAt(stringBlock.length() - 1));

        String a = "";
        System.out.println(a);
        // jei nera padeklaruota - bus defaultine reiksme null'as
        // IS NEEGZISTUOJANCIU OBJEKTU MES NIEKO NEGALIME ISPESTI!!
        String b = null;
        System.out.println(b);

        // bus true, musu atveju string a, nes nera tarpo
        System.out.println(a.isEmpty());
        // blankas iesko ar yra ar nera tuscio tarpo, jei padesim space bus sitas true
        System.out.println(a.isBlank());

        System.out.println(a.equals(""));

        //metodas replace
        //-* - sitas zenklas pakeistu bet ka pasikartojancius
        String replaced = text.replace("a", "o");
        System.out.println(replaced);


        // substringas - atspausdins nuo tam tikro simbolio
        // Z D A R O V A
        // 0 1 2 3 4 5 6
        System.out.println(text.substring(3));
        //NEITRAUKIANT TO PASKUTINIO SIMBOLIUKO (7), naudojam kai reikia sukarpyt teksta
        System.out.println(text.substring(2, 7));


        // INDECOF METODELIS
        System.out.println(text.indexOf('a'));
        System.out.println(text.indexOf("ov"));
        System.out.println(text.indexOf('w'));


        System.out.println(text.equals("Zdarova"));
        System.out.println(text.equals("zdarova"));
        System.out.println(text.equalsIgnoreCase("zdarova"));

        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

        // su trim triname tarpus is priekio ir is galo
        System.out.println("    Tekstas be tarpu  ".trim());

        //sulipdytas stringu tekstas, + kuria nauja stringa, o concat'as i ta pati stringa sumeta
        String result = text.concat("  ").concat("naujas").concat(text);
        System.out.println(result);

        String numb = "" + 558;
        numb = String.valueOf(8888);
        }
    }

