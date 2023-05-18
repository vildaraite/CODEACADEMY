package lt.code.academy;

import java.time.LocalDate;

public enum Gender {
    MALE(1, 3, 5),
    FEMALE(2, 4, 6);

    private final int getNumberXIX;
    private final int getNumberXX;
    private final int getNumberXXI;

    Gender(int getNumberXIX, int getNumberXX, int getNumberXXI) {
        this.getNumberXIX = getNumberXIX;
        this.getNumberXX = getNumberXX;
        this.getNumberXXI = getNumberXXI;
    }

    public static int getGenderNumber(LocalDate date, Gender gender) {
        int personYear = date.getYear();

        if(personYear >= 1800 && personYear <= 1899) {
            return gender.getNumberXIX;
        }

        if(personYear >= 1900 && personYear <= 1999) {
            return gender.getNumberXX;
        }

        return gender.getNumberXXI;
    }
}