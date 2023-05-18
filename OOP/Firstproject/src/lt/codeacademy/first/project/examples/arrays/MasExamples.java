package lt.codeacademy.first.project.examples.arrays;

public class MasExamples {
    public static void main(String[] args) {

        // create new mas
        // masyvo kurimas
        // duomenu tipas, pasakom, kad tai yra masyvas, ir butinai ilgis
        // trys budai, kaip sukurti masyva
        int[] mas = new int[10];
        // masyvas padeklaruotas prie vardo, jie panasus su virsuje esanciu, taciau virsutinis naudojamas dazniau
        int another[] = new int[10];
        int[] thirdMas = {7, 6, 5, 3};

        //get value from mas
        System.out.println(thirdMas[2]);

        // paskutinis elementas
        System.out.println(thirdMas[thirdMas.length- 1]);


        // priskiriama nauja reiksme masyvo nekatrajam elementui
        mas[2] = 0;

    }
}
