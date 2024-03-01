package Lesson_18.Task_1_ATM;

import java.util.ArrayList;
import java.util.LinkedList;

public class ATM {
    private MessageInterface messageInterface = null;
    private ShowMoneyInterface showMoneyInterface = null;
    private LinkedList<Integer> monies = new LinkedList<>();
    private MoneyType[] moneyType1 = MoneyType.values();


    private int  amoutMoney;


    public ATM() {
        this.monies = monies;
        monies.add(0);
        monies.add(0);
        monies.add(0);
        monies.add(0);
        monies.add(0);
        monies.add(0);
        monies.add(0);
        monies.add(0);
    }


    public  void addMoneys(LinkedList<Money> moniess){
        for (Money money : moniess) {
            switch (money.getMoneyType()){
                case ONE_THOUSAND -> {
                    int newvalue = 0;
                    newvalue += money.getAmount()/MoneyType.ONE_THOUSAND.getBanknote();
                    newvalue = newvalue +  monies.get(0);
                    monies.set(0, newvalue);
                }
                case TWO_THOUSAND -> {
                    int newvalue = 0;
                    newvalue += money.getAmount()/MoneyType.TWO_THOUSAND.getBanknote();
                    newvalue = newvalue +  monies.get(1);
                    monies.set(1, newvalue);
                }

                case FIVE_THOUSAND -> {
                    int newvalue = 0;
                    newvalue += money.getAmount()/MoneyType.FIVE_THOUSAND.getBanknote();
                    newvalue = newvalue +  monies.get(2);
                    monies.set(2, newvalue);
                }
                case TEN_THOUSAND -> {
                    int newvalue = 0;
                    newvalue += money.getAmount()/MoneyType.TEN_THOUSAND.getBanknote();
                    newvalue = newvalue +  monies.get(3);
                    monies.set(3, newvalue);
            }
                case TWENTY_THOUSAND -> {
                    int newvalue = 0;
                    newvalue += money.getAmount()/MoneyType.TWENTY_THOUSAND.getBanknote();
                    newvalue = newvalue +  monies.get(4);
                    monies.set(4, newvalue);
                }
                case FIFTY_THOUSAND -> {
                    int newvalue = 0;
                    newvalue += money.getAmount()/MoneyType.FIFTY_THOUSAND.getBanknote();
                    newvalue = newvalue +  monies.get(5);
                    monies.set(5, newvalue);
                }
                case ONE_HUNDRED_THOUSAND -> {
                    int newvalue = 0;
                    newvalue += money.getAmount()/MoneyType.ONE_HUNDRED_THOUSAND.getBanknote();
                    newvalue = newvalue +  monies.get(6);
                    monies.set(6, newvalue);
                }
                case TWO_HUNDRED_THOUSAND -> {
                    int newvalue = 0;
                    newvalue += money.getAmount()/MoneyType.TWO_HUNDRED_THOUSAND.getBanknote();
                    newvalue = newvalue +  monies.get(7);
                    monies.set(7, newvalue);
                }
            }
        }
        setMessageInterface(messageInterface.showMessage("Pullar muvaffaqiyatli qoshildi"));
    }

    public void moniesInfo(){
        setMessageInterface(messageInterface.showMessage("Sizda mavjud kupyuralar:"));
        System.out.println("___________________________");
        for (int i = 0; i <= 7; i++) {
            System.out.println(moneyType1[i]+" := " + moneyType1[i].getBanknote() +" minglik dan "+monies.get(i) + " ta bor ");
        }
    }

    public void isGetMoney(int getSumm){
        //5_215_000
        int newgetSumm=getSumm/1000;
        //5_215 kilib ildik
        if(getAmoutMoney() >= getSumm){
            if (getSumm%1000 == 0){     // getSumm 1000 dan kichik bo'lishi mumkin emas

                for (int i = 7; i >= 0; i--) { // biz bilamiz aniq bizda kupyuralar soni 8 ta
                    if ( monies.get(i) != 0){
                        int count = newgetSumm / moneyType1[i].getCount(); // agar i minglik dan getSumm ni ichida nechta borligini bilib olamaiz
                        if ( count < monies.get(i)){ // agar  berilgan count kaunt  mavjud bolganidan kam bolsa degan shart bajaramiz
                            newgetSumm = newgetSumm - moneyType1[i].getCount()*count;
                            monies.set(i,monies.get(i)-count);
                        }else {
                            newgetSumm = newgetSumm - monies.get(i)*moneyType1[i].getCount();
                            monies.set(i,0);
                        }
                    }
                }
            }

            setAmoutMoney(getSumm*(-1));
            setMessageInterface(messageInterface.showMessage("So'rovingiz muvofiqyatli amalga oshirildi  "));
            setShowMoneyInterface(showMoneyInterface.showMoneyData("Sizning qolgan mablagingiz :=",getAmoutMoney()));
        }else{
            setMessageInterface(messageInterface.showMessage("So'rovingiz  amalga oshirilmadi. hisobingizda mablag yetarli emas "));
            setShowMoneyInterface(showMoneyInterface.showMoneyData("Sizning hozida mavjud mablagingiz :=",getAmoutMoney()));
        }

    }
    public int getBalance(){
        for (int i = 0; i < 8; i++) {
           setAmoutMoney(monies.get(i)*moneyType1[i].getBanknote());
        }
        return getAmoutMoney();
    }
    public int getAmoutMoney() {
        return amoutMoney;
    }

    public void setAmoutMoney(int amoutMoney) {
        this.amoutMoney += amoutMoney;
    }

    public void setMessageInterface(MessageInterface messageInterface) {
        if(this.messageInterface==null){
            this.messageInterface = messageInterface;
        }}
    public void setShowMoneyInterface(ShowMoneyInterface showMoneyInterface) {
        if(this.showMoneyInterface==null){
            this.showMoneyInterface = showMoneyInterface;
        }}

    void getAllCountBanknote(){
        System.out.println(monies);
    }



}
