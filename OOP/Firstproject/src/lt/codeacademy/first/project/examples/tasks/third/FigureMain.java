package lt.codeacademy.first.project.examples.tasks.third;
/*
 Į klasę Figura pridėti atributus:
  pavadinimas,plotis ir aukštis ir pan.
  Parašyti jiems get ir set metodus klasėje Figura.
  Get ir set metodus panaudoti pagrindinėje klasėje
  Pirmoji, t.y. nustatyti figūrų pavadinimus,pločius ir aukščius.
  Sukurti daugiau objektų - figūrų (pvz, stačiakampis)
  Atspausdinti gautus rezultatus ekrane.
 */
public class FigureMain {
    public static void main(String[] args) {
        Figure figure = new Figure("triangle", 56.98, 34.56);

        System.out.printf("%s %s %s%n", figure.getHeight(), figure.getWidth(), figure.getName());
        // gaunam hash'a objekto
        System.out.println(figure);
    }
}
