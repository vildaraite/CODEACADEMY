package lt.codeacademy.first.project.examples.repeattasks;

public enum Month {
    JANUARY(1, "January", "01", 31),
    FEBRUARY(2, "February", "02", 28),
    MARCH(3, "March", "03", 31),
    APRIL(4, "April", "04", 30),
    MAY(5, "May", "05", 31),
    JUNE(6, "June", "06", 30),
    JULY(7, "July", "07", 31),
    AUGUST(8, "August", "08", 31),
    SEPTEMBER(9, "September", "09", 30),
    OCTOBER(10, "October", "10", 31),
    NOVEMBER(11, "November", "11", 30),
    DECEMBER(12, "December", "12", 31);

    private final int id;
    private final String name;
    private final String number;
    private final int days;

    Month(int id, String name, String number, int days) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.days = days;
    }

    public static Month getMonth(int id, int days) throws DateFormatException {
        for(Month m : Month.values()) {
            if(m.id != id) {
                continue;
            }

            if(days < 1 || days > m.days){
                throw new DateFormatException(String.format("Dienos turi buti tarp %s ir %s%n", 1, m.days));
            }

            return m;
        }

        throw new DateFormatException("Toks menesis neegzistuoja");
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getDays() {
        return days;
    }
}
