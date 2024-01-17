package LessonTwelve.Task2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class IceCream  {

    public Piece piece;
    public Resept resept;
    private float milk;
    private float sugar;
    private  int countOfIceCreaam;
    private int profit;
    private ArrayList<Integer> sell = new ArrayList<Integer>();


    public IceCream(Piece piece, Resept resept) {
        this.piece = piece;
        this.resept = resept;
    }



    public void addMilk(Milk m){
        this.milk = m.getSize();

    }
    public void  addSugar(Suger s){
        this.sugar = s.getWeight();
    }
    public int getCount(){

        while (milk >= resept.getRatioOfMilk() && sugar >= resept.getRatioOfMilk()){
        if(resept.getRatioOfMilk() <= milk && resept.getRatioOfSugar() <= sugar){
          countOfIceCreaam++;
          milk = milk-resept.getRatioOfMilk();
          sugar = sugar-resept.getRatioOfSugar();
       }
       // #TODO Sikl ishlatmasdan n/m nisbatda bolsa milk/n ga va sugar/m ga bularni ichida kichigini javobkilib olsakham bo'lar ekan'
       //TODO yani 3/2 nisbat bolsa milk 90 sugar 140 bolsa 90/3 = 30 140/2=70 bizni milk elementimiz nisbat boyicha 30 ta muzqaymoqga
            // TODO etar ekar sugar esa 70ta eng kichigi 30 shuning uchu u  javob boladi
            /*float newMilk = milk/resept.getRatioOfMilk();
            float newSugar = sugar/resept.getRatioOfSugar();
            return  (int)Math.min(newMilk,newSugar)*/
       }
        return countOfIceCreaam;
    }
    public boolean buy(int amount){
        if ( getCount() >= amount){
            countOfIceCreaam-=amount;
            sell.add(amount);
            return true;
        }
        return false;
    }
    public int getBalance(){
        int balance=0;
        if (!sell.equals(null)){
            for (Integer i : sell) {
                balance+=piece.getPriceIceCream()*i;

            }
        }
        return balance;
    }
    public boolean hasIceCream(){
        return (countOfIceCreaam>0);
    }
    public ArrayList getInfo(){
        ArrayList<Integer> getBalance = new ArrayList<Integer>();
        for (Integer i : sell) {
          getBalance.add(piece.getPriceIceCream()*i);

        }
        return getBalance;
    }

    public int getProfit(){

        return getBalance();
    }
}
