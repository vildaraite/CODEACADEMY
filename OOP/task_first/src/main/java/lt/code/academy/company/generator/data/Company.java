package lt.code.academy.company.generator.data;

public class Company {

    private String firmName;

    private String code;

    private int numberOfEmployee;

    private double averageSalary;

    public Company(String firmName, String code, int numberOfEmployee, double averageSalary) {
        this.firmName = firmName;
        this.code = code;
        this.numberOfEmployee = numberOfEmployee;
        this.averageSalary = averageSalary;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    public double getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(double averageSalary) {
        this.averageSalary = averageSalary;
    }
}
