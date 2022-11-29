package lt.codeacademy.first.project.examples.tasks.third;
/*Parašyti programą su klase Darbuotojas kuri turi tokius metodus:
gautiInfo() ,
kuris atspausdina atlyginimą ir dirbtų valandų skaičių

pridėtiAtlyginimą() , kuris prideda 10 Eur

pridėtiDarbą() , kuris prideda 5 Eur prie algos
ir prideda per metodo parametrą gautą valandų skaičių.

Klasė turi du kintamuosius: atlyginimas ir darbas.
Klasė Darbuotojas turi turėti bent 2 konstruktorius.
Darbuotojas tipo objektą susikurti kitoje klasėje ir
paeksperimentuoti  su package-private, private,
protected ir public modifikatoriais  perkeliant klasę
Darbuotojas į kitą paketą.
Klasė Darbuotojas testuojama kitoje klasėje,
kuri turi main metodą.
 */
public class Employer {
    private static final int PAYMENT_BY_HOUR = 50;
    private double salary;
    private int workHours;

    // konstruktorius, kuriame public, nes jei butu private, negaletumem sukurti objekto
    public Employer(){
        salary = 0;
        workHours = 0;

    }

    public Employer(double salary, int workHours) {
        this.salary = salary;
        this.workHours = workHours;
    }

    // gali buti ir ne public, nes po tuo paciu package'u
     void getInfo(){

        System.out.printf("Darbuotojo isdirbtos valandos %s h, gautos pajamos %s eu%n", workHours, salary);
    }
    public void addSalary(){
        salary += 10; // same as salary = salary + 10;
    }

    public void addJob(int hours){
        workHours += hours;
        salary += PAYMENT_BY_HOUR * hours;

    }
}
