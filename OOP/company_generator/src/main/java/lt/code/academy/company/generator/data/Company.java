package lt.code.academy.company.generator.data;

public class Company {
    private String name;
    private String code;
    private int employersNumb;
    private double averageOfSalary;

    public Company() {
    }

    public Company(String name, String code, int employersNumb, double averageOfSalary) {
        this.name = name;
        this.code = code;
        this.employersNumb = employersNumb;
        this.averageOfSalary = averageOfSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getEmployersNumb() {
        return employersNumb;
    }

    public void setEmployersNumb(int employersNumb) {
        this.employersNumb = employersNumb;
    }

    public double getAverageOfSalary() {
        return averageOfSalary;
    }

    public void setAverageOfSalary(double averageOfSalary) {
        this.averageOfSalary = averageOfSalary;
    }
}