package Lesson_6;

public class CoffeMaker {
    int water;
    int sugar;
    int coffe;
    int maxCountOfCoffee;
    CoffeMaker(int water, int sugar, int coffe){
        this.coffe = coffe;
        this.sugar = sugar;
        this.water = water;
    }
    boolean isMakeCoffees( int oneWater,int oneSugar,int oneCoffee, int count) {
        int amount = 0;
        while (this.coffe > 0 && this.sugar > 0 && this.water > 0) {
            this.water -= oneWater;
            this.sugar -= oneSugar;
            this.coffe -= oneCoffee;
            amount++;
        }
        if (amount >=count){
            System.out.println("You can make  " + count + " coffee");
        }else{
            System.out.println("You can not make  " + count + " coffee");
            System.out.println("You can make  " + amount + " coffee");
        }
        return amount >=count;
    }
    void maxCount( int oneWater, int oneSugar,int oneCoffee){
        int amount = 0;
        while (this.coffe > 0 && this.sugar > 0 && this.water > 0) {
            this.water -= oneWater;
            this.sugar -= oneSugar;
            this.coffe -= oneCoffee;
            amount++;
        }
        this.maxCountOfCoffee = amount;
    }
    void showInfo(){
            System.out.println("You can make maximum " + maxCountOfCoffee + " coffee");

    }
}
