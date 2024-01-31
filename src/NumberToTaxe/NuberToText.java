package NumberToTaxe;

import java.util.ArrayList;
import java.util.Arrays;

public class NuberToText {
    private Number1_10[] numberType = Number1_10.values();
    private MoneyTaype[] moneyTaype = MoneyTaype.values();
    private  Number10_90[] number1090s =Number10_90.values();
    private String money = new String();

    public String getIntToStr(String nubers){

        String string = nubers.substring(0,nubers.indexOf('.'));
        String string1 = nubers.substring((nubers.indexOf('.')));
        int in = 0;

        for (int j = 0; j <string.length(); j++) {
            int index = j+1;
            for (int i = 0; i < 9; i++) {
                if(Integer.valueOf(string.substring(j, index)) == 0) {
                    break;
                }else {
                    if (Integer.valueOf(string.substring(j, index)) == numberType[i].getNumber()) {
                        if(j==1||j==4||j==7||j==10){
                            setMoney(String.valueOf(number1090s[i].getName()));
                            setMoney(" ");
                        }else {
                            setMoney(numberType[i].getName());
                            setMoney(" ");
                        }
                        if(j==2||j==5||j==8){
                            setMoney(String.valueOf(moneyTaype[in].getName()));
                            in = in+1;
                            setMoney(" ");
                        }
                        if(j==0||j==3||j==6 || j==9){
                            setMoney(String.valueOf(number1090s[9].getName()));
                            setMoney(" ");
                        }
                    }
                }
            }
        }
        setMoney(String.valueOf(moneyTaype[3].getName()));
        setMoney(" ");

                for (int i = 0; i < 9; i++) {
                    if (Integer.valueOf(string1.substring(1,2)) == number1090s[i].getNumber()) {
                        setMoney(String.valueOf(number1090s[i].getName()));
                        setMoney(" ");
                    }if (Integer.valueOf(string1.substring(2,3)) == numberType[i].getNumber()) {
                        setMoney(String.valueOf(numberType[i].getName()));
                        setMoney(" ");
                    }
                }
        setMoney(String.valueOf(moneyTaype[4].getName()));

        return getMoney();
    }
    public String getMoney() {
        return money;
    }
    public void setMoney(String money) {
        this.money = this.money.concat(money);
    }

}
