package lt.codeacademy.first.project.examples.inheritance.task.insurance;

class Insurance {
    private final String insuredPerson;
    private final double sum;
    private final String country;

    public Insurance(String insuredPerson, double sum, String country) {
        this.insuredPerson = insuredPerson;
        this.sum = sum;
        this.country = country;
    }

    public String getInsuredPerson() {
        return insuredPerson;
    }

    public double getSum() {
        return sum;
    }

    public String getCountry() {
        return country;
    }
}