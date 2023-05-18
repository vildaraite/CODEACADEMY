package lt.code.academy.budget;

import lt.code.academy.budget.data.Income;
import lt.code.academy.budget.data.IncomeCategory;
import lt.code.academy.budget.data.Person;
import lt.code.academy.budget.data.TransferStatus;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class BudgetMain {
    public static void main(String[] args) {
        // mainas sukuria objektus, kuriu mums reikia sioje klaseje
        Scanner sc = new Scanner(System.in);
        //pasikuriam objekta, kad galetumem issikviesti metoda, nes jis privatus
        // budget sukuriame tam, kad galetumem issikviesti visus ne statinius metodus is sios klases
        BudgetMain budgetMain = new BudgetMain();
        // naudojame createIncome metode, o kuriame maine, nes reikia bendro objekto, kad visi income'ai outcom'ai
        // kur ir turetu buti
        Budget budget = new Budget();

        String action;

        do {
            // parodom vartotojui meniu ir tikimes, kad vartotojas kazka ives
            budgetMain.menu();
            action = sc.nextLine();

            budgetMain.userAction(action, sc, budget);
        }while(!action.equals("5"));
        // ! reiskia, kad vaziuosim tol, kol actionas bus nelygus penkiems, kai jau action bus lygu penkiems

    }

    private void userAction(String action, Scanner sc, Budget budget){
        switch (action){
            case "1" -> createIncome(sc, budget);
            case "2" -> System.out.println("Sukurti islaidas"); // TODO NAMU DARBAI implementinti sita vieta
            case "3" -> getIncome(sc, budget);
            case "4" -> System.out.println("Gauti islaidas"); // TODO NAMU DARBAI implementinti sita vieta
            case "5" -> System.out.println("Programa baige darba");
            default -> System.out.println("tokio actiono nera");
        }
    }
    private void createIncome(Scanner sc, Budget budget){
        BigDecimal incomeSum = getCorrectNumber(sc);

        System.out.println("Iveskite kategorija" + Arrays.toString(IncomeCategory.values()));
        String category = sc.nextLine();

        System.out.println("Bankinis pavedimas? Y/N");
        String bankTransfer = sc.nextLine();
        boolean isBankTransfer = "Y".equals(bankTransfer.toUpperCase());

        Person person = getPerson(sc);

        Income income = new Income(
                incomeSum,
                LocalDate.now(),
                IncomeCategory.valueOf(category.toUpperCase()),
                isBankTransfer,
                person,
                TransferStatus.IN_PROGRESS);

        budget.addIncome(income);
    }

    private void getIncome(Scanner sc, Budget budget    ){
        System.out.println("Iveskite kategorija" + Arrays.toString(IncomeCategory.values()));
        String category = sc.nextLine();
        IncomeCategory incomeCategory = IncomeCategory.valueOf(category.toUpperCase());

        System.out.println("Iveskite data, pvz: 2000.01.01");
        String date = sc.nextLine();
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy.MM.dd"));

        Income income = budget.getIncome(incomeCategory, localDate);
        System.out.println(income);
    }

    private void menu(){
        System.out.println("""
          1. Sukurti pajamas
          2. Sukurti islaidas
          3. Gauti pajamu irasa pagal kategorija ir data
          4. Gauti islaidu irasa paga kategorija ir data
          5. Exit
                """);
    }

    private Person getPerson(Scanner sc){
        System.out.println("Iveskite varda:");
        String name = sc.nextLine();
        System.out.println("Iveskite pavarde");
        String surname = sc.nextLine();

        return new Person(name, surname, 0);
    }

    private BigDecimal getCorrectNumber (Scanner sc){
        while(true){
            try {
                System.out.println("Iveskite suma:");
                String line = sc.nextLine();

                return new BigDecimal(line);
            } catch(NumberFormatException e){
                System.out.println("Bloga ivestis");
            }
        }
    }
}
