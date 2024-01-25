package Lesson_18.Task_1_ATM;

public enum MoneyType {

    ONE_THOUSAND(1000,1), TWO_THOUSAND(2000,2), FIVE_THOUSAND(5000,5), TEN_THOUSAND(10000,10), TWENTY_THOUSAND(20000,20), FIFTY_THOUSAND(50000,50), ONE_HUNDRED_THOUSAND(100_000,100), TWO_HUNDRED_THOUSAND(200_000,200);
    private int banknote;
    private  int count;

    public int getCount() {
        return count;
    }

    public int getBanknote() {
        return banknote;
    }

    MoneyType(int banknote, int count) {
        this.banknote = banknote;
        this.count = count;
    }
}
