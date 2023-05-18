package lt.codeacademy.first.project.examples.constants;

public enum Week {
    // labai daznai naudojami enumai laikyti informacija tarkime apie
    // salis, kaip pvz Lietuva, trumpinys LTU, valiuta EUR ir t.t.
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday",4 ),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);


    private final String name;
    private final int numb;

    // enumo konstruktoriai visada yra private, nes objekto nekuriame
    // enumams
    private Week(String name, int numb){
        this.name = name;
        this.numb = numb;

    }
    public String getName(){
        return name;
    }
    public int getNumb(){
        return numb;
    }
}
