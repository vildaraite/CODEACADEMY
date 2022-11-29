package lt.codeacademy.first.project.examples.repeat;

import static java.awt.SystemColor.text;

/*Sukurkite programa, kuri atliktu:
1. grazintu kiek raidziu yra paduotame tekste
2. pakeistu s raide i "!"
3. atspausdintu mdifikuota teksta ir kiek raidziu tame tekste
veiksmai atliekami atskiroje klaseje
 */
public class StringRepeatExampleMain {
    public static void main(String[] args) {

        StringRepeatExample example = new StringRepeatExample();
        example.printText("Naujas tekstas, kuris bus modifikuotas");

        String text = example.replaceCharInText("Dar vienas tekstas, kuris bus pakeistas");
        System.out.println(text);
    }
}
