package lt.codeacademy.first.project.examples.inheritance.task.insurance;

class CarInsurance extends Insurance {
    private final String carNumber;

    public CarInsurance(String insuredPerson, double sum, String country, String  carNumber) {
        super(insuredPerson, sum, country);
        this.carNumber = carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }
}