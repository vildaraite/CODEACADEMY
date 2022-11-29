package lt.codeacademy.first.project.examples.tasks.first;

public class TaskThree {

    /*
    •Klasė turi main metodą, kuris kviečia Jūsų sukurta static metodą spausdink()
    •Šis metodas priima 3 eilutės tipo parametrus ir vieną int parametrą•Metodas atspausdina tekstą. Teksto šablonas:
    •„Aš, [vardas] [pavade], tikrai išmoksiu programuoti [kalba] kalba per[savaiciuSkaicius] savaites“
     */

    public static void main(String[] args) {
// kad gautusi dedame kabutes ir tada rasome zodi
        print("Vilda", "Beizaraite", "JAVA", Integer.parseInt("40"));
    }

    public static void print(String name, String surname, String language, int weeksNumb){
        System.out.printf("as, %s %s, tikrai ismoksiu programuoti %s kalba per %s savaiciu%n", name, surname,language,weeksNumb);




    }
}
