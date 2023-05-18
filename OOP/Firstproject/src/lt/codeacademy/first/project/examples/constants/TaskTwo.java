package lt.codeacademy.first.project.examples.constants;
/*
 Parašyti metodą kuris per parametrus pasiimtų tekstą ir per grąžinamą reikšmę praneštų ar
jame yra ieškomas žodis pvz:“labas”
 */
public class TaskTwo {

    static final String WORD_TO_LOOK_FOR = "Labas";
    public static void main(String[] args) {

        var text = "Labas, salos gyventojai";
        var containsLabas = text.indexOf(WORD_TO_LOOK_FOR);

        if (containsLabas > -1) {
            System.out.println("text contained " + WORD_TO_LOOK_FOR);
        }else {
            System.out.println("text did not contain " + WORD_TO_LOOK_FOR);
        }
    }

}
