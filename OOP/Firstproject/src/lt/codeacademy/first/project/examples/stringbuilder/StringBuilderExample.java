package lt.codeacademy.first.project.examples.stringbuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        String text = "Labas";

        text+= "as krabas";

        text = text + "kvailas pasakymas " + 50;
        System.out.println(text.toUpperCase());

        // klaseje naudojama tada, kai reikia modifikuoti, vis bandyti nauja reiksme
        // kai tik spausdinamas ir kvieciamas sitas metodas, tada kuriamas naujas objektas
        // nera imutable
        // metodas append -
        // metodas lenght -
        // metodas indexOf -
        // metodas substring -
        // metodas delete -
        StringBuilder stringBuilder = new StringBuilder("Builderio default value");

        if(true){
            stringBuilder.append(" buvo true ");
        }
        stringBuilder.append("  ").append(50).append("!!!!");

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.indexOf("ult"));
        System.out.println(stringBuilder.indexOf("ult", 15));
        System.out.println(stringBuilder.delete(10, 17));
        System.out.println(stringBuilder.insert(9, "nauja reiksme").append("  "));
        System.out.println(stringBuilder.reverse());
    }
}
