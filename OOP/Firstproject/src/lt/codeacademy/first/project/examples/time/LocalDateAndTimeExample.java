package lt.codeacademy.first.project.examples.time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateAndTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.plusYears(20).getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        // beleka galim issitraukt

        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);
        System.out.println(localDate.atStartOfDay());

        LocalDateTime localDateTimeOne = LocalDateTime.now();
        localDateTime.minusHours(3).plusDays(6);
        System.out.println(localDateTimeOne);

    }

}
