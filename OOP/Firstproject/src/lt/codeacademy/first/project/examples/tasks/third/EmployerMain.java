package lt.codeacademy.first.project.examples.tasks.third;

public class EmployerMain {
    public static void main(String[] args) {

        // Antano 0 h 0 eur -> firstEmployer
        // Jonas 50 h 1000 eur
        Employer firstEmployer = new Employer();// nereikia paduot parametru, nes
        //skliausteliuose nieko nera, ieskom tokio pat, be parametru
        Employer secondEmployer = new Employer(1000, 50);

        firstEmployer.getInfo();
        secondEmployer.getInfo();

        firstEmployer.addJob(50);
        secondEmployer.addSalary();

        firstEmployer.getInfo();
        secondEmployer.getInfo();
    }
}
