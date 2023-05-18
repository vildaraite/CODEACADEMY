package lt.codeacademy.first.project.examples.operators.tasks;

import lt.codeacademy.first.project.examples.homework.FirstTask;

import java.time.Year;
import java.util.GregorianCalendar;

public class LeapTask {
    public static void main(String[] args) {
        int year = 2024;

        LeapTask task = new LeapTask();
        String text = task.isLeapYear(year) ? "Is Leap year" : "Is common year";
        System.out.println(text);

        GregorianCalendar calendar = new GregorianCalendar();
        boolean isLeapYear = calendar.isLeapYear(year);
        System.out.println(isLeapYear);

        boolean isLeap = Year.of(year).isLeap();
        System.out.println(isLeap);

    }

    private boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        }else if (year % 400 != 0){
            return false;
        }
        return true;
    }
}
