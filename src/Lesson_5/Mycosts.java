package Lesson_5;

public class Mycosts{
    String name;
    int money;

    void showInfo() {
        System.out.println("User name:" + name);
        System.out.println("User " + name + " your balans = " + money);
    }

    int getMoney() {
        return this.money;
    }

    void spendMoney(int money) {
        this.money -= money;
        showInfo();
    }

    void addMoney(int addSumm) {
        this.money += addSumm;
        showInfo();
    }
}

