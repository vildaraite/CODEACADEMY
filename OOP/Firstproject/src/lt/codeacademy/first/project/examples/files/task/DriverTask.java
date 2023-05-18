package lt.codeacademy.first.project.examples.files.task;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DriverTask {
    public static void main(String[] args) {
        DriverTask driverTask = new DriverTask();
        List<Driver> drivers = List.of(new Driver("Andrius", "LADA", "KEI987", 9855555),
                new Driver("Jonas", "Audi", "PPR987", 98555));

        driverTask.writeDrivers(drivers, "drivers.csv");
    }

    private void writeDrivers(List<Driver> drivers, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for(Driver driver: drivers) {
                bw.write(driver.toString());
                bw.newLine();
            }
        } catch(IOException e) {
            System.out.printf("Cannot write to %s, reason:%s%n", fileName, e.getMessage());
        }
    }
}
