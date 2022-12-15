package lt.code.academy.budget;

import lt.code.academy.budget.data.Income;
import lt.code.academy.budget.data.IncomeCategory;
import lt.code.academy.budget.data.Outcome;
import lt.code.academy.budget.data.OutcomeCategory;

import java.time.LocalDate;
import java.time.LocalDateTime;


class Budget {
    private Income[] incomes;
    private Outcome[] outcomes;


    void addIncome(Income income){
        if(incomes == null){
            incomes = new Income[1];
        } else {
            Income[] temp = new Income[incomes.length +1];
            for(int i = 0; i < incomes.length; i++){
                temp [i] = incomes[i];
            }
            incomes = temp;
        }

        incomes[incomes.length - 1] = income;
    }

    void addOutcome(Outcome outcome){
        if(outcomes == null){
            outcomes = new Outcome[1];
        }else{
            Outcome[] temp = new Outcome[outcomes. length + 1];
            for (int i = 0; i < outcomes.length; i++){
                temp [i] = outcomes[i];
            }
            outcomes = temp;
        }
        outcomes[outcomes.length - 1] = outcome;
    }

    Income getIncome(IncomeCategory category, LocalDate date) {
        if(incomes == null) {
            return null;
        }

        for(Income income: incomes) {
            if(income.getCategory().equals(category) && income.getDate().isEqual(date)) {
                return income;
            }
        }

        return null;
    }

    Outcome getOutcome(OutcomeCategory category, LocalDateTime date) {
        if(outcomes == null) {
            return null;
        }

        for(Outcome outcome: outcomes) {
            if(outcome.getCategory().equals(category) && outcome.getDate().isEqual(date)) {
                return outcome;
            }
        }

        return null;
    }
}