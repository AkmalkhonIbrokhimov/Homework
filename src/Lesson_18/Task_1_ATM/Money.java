package Lesson_18.Task_1_ATM;

import java.util.Objects;

public class Money  {
    private  int amount;
    private MoneyType moneyType;


    public Money(int amount, MoneyType moneyType) {
        this.amount = amount;
        this.moneyType = moneyType;
    }


    public MoneyType getMoneyType() {
        return moneyType;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money money)) return false;
        return getAmount() == money.getAmount();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAmount());
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", moneyType=" + moneyType +
                '}';
    }
}
