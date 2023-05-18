package lt.codeacademy.first.project.examples.vararg;

import java.util.List;

public class MainVararg {
    public static void main(String[] args) {
        MainVararg main = new MainVararg();
        //main.print(5, List.of());
        main.print(5);
        main.print(5, "a");
        main.print(5, "a", "test");
        main.print(5, "a", "test", "ttttt");
        main.print(5, "a", "test", "ttttt", "98fd9g5d");
    }

	/*private void print(int a, String text) {
		System.out.println(a + text);
	}
	private void print(int a, String text, String secondText) {
		//...
	}
	private void print(int a, String text, String secondText, String thirdText){
		//...
	}
	private void print(int a, List<String> texts) {
		// kad texts privalo buti sukurtas listas
	}*/

    // cia svarbu, kad varargsai eitu gale parametru, butu paskutiniai
    // nes nezinoma, kiek ju bus, del to jie turi eiti paciame gale, kad uzpildytu gala, deime varargsu kiek noresime
    // niekas neprasys jokio dydzio ju
    // galim iskvieste be stringo
    // galim iskviesti su kiek tik norime stringu
    // taisykles varargsu - paskutiniai eina, viename metode negali buti keliu varargsu

    private void print(int a, String... texts) {

        System.out.println(a);

        for(String t: texts) {
            System.out.println(t);
        }

    }
}