package LessonTwelve.Task2;

public class Main {
    public static void main(String[] args) {
        Milk m = new Milk(80, 2000);
        Suger s = new Suger(120, 6000);
        Resept r = new Resept(2, 1);
        Piece f = new Piece(0.2, 2000);
        IceCream iceCream = new IceCream(f,r);

        iceCream.addMilk(m);
        iceCream.addSugar(s);
        System.out.println("Count: " + iceCream.getCount());

       System.out.println("Buy 5: " + iceCream.buy(5));
        System.out.println("Buy 6: " + iceCream.buy(6));
       System.out.println("Balance: " + iceCream.getBalance());
       System.out.println("Has Ice Cream: " + iceCream.hasIceCream());
       System.out.println("Info:" + iceCream.getInfo());

       System.out.println("Profit: " + iceCream.getProfit());
    }
}
