package Lesson_18.Task_1_ATM;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Money> monies = new LinkedList<Money>();
        monies.add(new Money(1_000,MoneyType.ONE_THOUSAND));
        monies.add(new Money(2_000,MoneyType.TWO_THOUSAND));
        monies.add(new Money(5_000,MoneyType.FIVE_THOUSAND));
        monies.add(new Money(10_000,MoneyType.TEN_THOUSAND));
        monies.add(new Money(20_000,MoneyType.TWENTY_THOUSAND));
        monies.add(new Money(50_000,MoneyType.FIFTY_THOUSAND));
        monies.add(new Money(100_000,MoneyType.ONE_HUNDRED_THOUSAND));
        monies.add(new Money(200_000,MoneyType.TWO_HUNDRED_THOUSAND));

        LinkedList<Money> monies1 = new LinkedList<Money>();
        monies1.add(new Money(50_000,MoneyType.FIFTY_THOUSAND));
        monies1.add(new Money(100_000,MoneyType.ONE_HUNDRED_THOUSAND));
        monies1.add(new Money(10_000,MoneyType.ONE_THOUSAND));
        monies1.add(new Money(20_000,MoneyType.TWO_THOUSAND));
        monies1.add(new Money(500_000,MoneyType.FIFTY_THOUSAND));
        monies1.add(new Money(100_000,MoneyType.ONE_HUNDRED_THOUSAND));
        monies1.add(new Money(200_000,MoneyType.TWENTY_THOUSAND));
        monies1.add(new Money(200_000,MoneyType.TWO_HUNDRED_THOUSAND));
        monies1.add(new Money(50_000,MoneyType.FIVE_THOUSAND));
        monies1.add(new Money(10_000,MoneyType.TEN_THOUSAND));
        ATM atm = new ATM();
        atm.setMessageInterface(new MessageInterface() {
            @Override
            public MessageInterface showMessage(String message) {
                System.out.println(message);
                return null;
            }
        });
        atm.setShowMoneyInterface(new ShowMoneyInterface() {
            @Override
            public ShowMoneyInterface showMoneyData(String amount, int count) {
                System.out.println(amount+count);
                return null;
            }
        });

        atm.addMoneys(monies);
        System.out.println(atm.getBalance());
        System.out.println("______________________________");

        atm.addMoneys(monies1);
        System.out.println(atm.getBalance());
        System.out.println("______________________________");

        atm.moniesInfo();
        atm.getAllCountBanknote();
        System.out.println("______________________________");

        atm.isGetMoney(1_512_000);

        atm.moniesInfo();
        atm.getAllCountBanknote();

    }

}
