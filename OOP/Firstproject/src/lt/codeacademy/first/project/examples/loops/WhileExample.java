package lt.codeacademy.first.project.examples.loops;

public class WhileExample {
    public static void main(String[] args) {

        int i = 0;
        //tikrina ir jei true atlieka veiksma
        // tam jis buvo sukurtas, kad jei salyga tenkina, tada while'as mums atlieka veiksma
        // atlieka patikrinima, tada veiksma
        while(i < 10){
            System.out.println(":) ");
            i++;
        }

        // atlieka veiksma ir tikrina ar kartoti
        //

        do {
            System.out.println(i);
        }while (i<10);
    }
}
