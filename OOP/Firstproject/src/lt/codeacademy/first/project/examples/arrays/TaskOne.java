package lt.codeacademy.first.project.examples.arrays;

//•Vartotojas įveda 10 vardų•
// Tuos vardus sudeda į String tipo masyvą•
// Atspausdina visus masyvo elementus tokiu formatu:•
// {vardas vien didžiosiomis raidėmis}-
// {vardo simbolių ilgis}-
// {elemento masyve  numeris}•
// Pvz: "JURGIS-6-0"


import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println("Iveskite 10 vardu:");
        var names = getNames();

        for (var i = 0; i <= names.length; i++){
            var currentname = names[i];
            var modifiedName = currentname.toUpperCase() + "-" +currentname.length() + "-" + i;
            System.out.println(modifiedName);
        }

    }

    // Stringu array'us vardu get input, sitame metode uzsikuriam scanneri, kuris leis vartotojui ivesti vardus
    // arrejuj priskiriame varda ir nusakome to masyvo skaiciu
    static String[] getNames() {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];


        for (int i = 0; i <= 9; i++) {
        var name = sc.nextLine();
        names[i] = name;
    }

        return names;
    }


}
