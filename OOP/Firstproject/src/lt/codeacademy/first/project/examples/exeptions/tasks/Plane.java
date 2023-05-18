package lt.codeacademy.first.project.examples.exeptions.tasks;

import java.util.Random;

public class Plane {
    private final Random random;

    public Plane() {
        random = new Random();
    }

    void expandChassis() {
        int randNumb = random.nextInt(11);

        try {
            int result = 10 / randNumb;
            if(result == 5) {
                chassis();
            }

            System.out.println("OK, vaziuokle sekmingai isskleista");
        } catch(ArithmeticException e) {
            System.out.println("ERROR: važiuoklės išskleisti nepavyko");
        } catch(ImportantException e) {
            System.out.printf("ERROR: %s, Svarbumas: SVARBI%n",e.getReason());
        } catch(TemporaryException e) {
            System.out.printf("ERROR: %s, Svarbumas: LAIKINA%n",e.getReason());
        } catch(ExpandChassisException e) {
            System.out.printf("ERROR: %s, Svarbumas: NEZINOMAS%n",e.getReason());
        } finally {
            System.out.println("INFO: lektuvas skrenda");
        }
    }

    private void chassis() throws ExpandChassisException {
        int randNumb = random.nextInt(11);
        switch(randNumb) {
            case 0 -> throw new ImportantException("Neatsidaro durys");
            case 1 -> throw new ExpandChassisException("Exception1");
            case 2 -> throw new TemporaryException("Exception2");
            case 3 -> throw new ImportantException("Exception3");
            case 4 -> throw new ExpandChassisException("Exception4");
            case 5 -> throw new ExpandChassisException("Exception5");
            case 6 -> throw new TemporaryException("Exception6");
            case 7 -> throw new ImportantException("Exception7");
            case 8 -> throw new ExpandChassisException("Exception8");
            case 9 -> throw new TemporaryException("Exception9");
            case 10 -> throw new ImportantException("Exception10");
        }
    }

}