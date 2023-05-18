package lt.codeacademy.first.project.examples.inheritance.task.insurance;

public class Main {
    public static void main(String[] args) {
        Insurance kasko = new KaskoInsurance("Andrius Baltrunas", 550, "LT", "ABC198", 120);
        Insurance tpvca = new TPVCAInsurance("Petras Petraitis", 120, "LT", "CCC999");

        System.out.printf("Apdraustasis: %s, suma: %s%n",kasko.getInsuredPerson(), kasko.getSum());
        System.out.printf("Apdraustasis: %s, suma: %s%n",tpvca.getInsuredPerson(), tpvca.getSum());

        System.out.println(((CarInsurance)kasko).getCarNumber());
        System.out.println(((CarInsurance)tpvca).getCarNumber());

        //System.out.println(((KaskoInsurance)kasko).getFranchise());

        if(kasko instanceof KaskoInsurance insurance) {
            System.out.println(insurance.getFranchise());
        }
    }
}