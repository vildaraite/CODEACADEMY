package lt.code.academy.budget.data;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Income {
    private final BigDecimal sum;
    private final LocalDate date;
    private final IncomeCategory category;
    private final boolean isBankTransfer;
    private final Person person;
    private final TransferStatus transferStatus;

    // desinys, generate, pasizymim visus, sukuriam construktoriu
    public Income(BigDecimal sum, LocalDate date, IncomeCategory category, boolean isBankTransfer, Person person, TransferStatus transferStatus) {
        this.sum = sum;
        this.date = date;
        this.category = category;
        this.isBankTransfer = isBankTransfer;
        this.person = person;
        this.transferStatus = transferStatus;
    }

    // desinys, generate, pasirenkam visus ir geterius susikuriam
    public BigDecimal getSum() {
        return sum;
    }

    public LocalDate getDate() {
        return date;
    }

    public IncomeCategory getCategory() {
        return category;
    }

    public boolean isBankTransfer() {
        return isBankTransfer;
    }

    public Person getPerson() {
        return person;
    }

    public TransferStatus getTransferStatus() {
        return transferStatus;
    }

    @Override
    public String toString() {
        return "Income{" +
                "sum=" + sum +
                ", date=" + date +
                ", category=" + category +
                ", isBankTransfer=" + isBankTransfer +
                ", person=" + person +
                ", transferStatus=" + transferStatus +
                '}';
    }
}
