package LessonFive;

public class MakeIceCream {
    int milk;
    int sugar;

    void addmilk(int a) { this.milk += a; }
    void addSugar(int b) {  this.sugar += b; }
    int maxIceCreamCount(int a, int b) {
        int amount = 0;
        while ((this.milk >= a) && (this.sugar >= b)) {
            this.milk = this.milk - a;
            this.sugar = this.sugar - b;
            amount++;
        }
        System.out.println(" From the given parable, so much ice cream can be made = " + amount);
        System.out.println("Remaining products:" + this.milk + "  milk; " + this.sugar + " sugar");
        return amount;
    }
    void showInfo() {  System.out.println("we have" + this.milk + "  milk; " + this.sugar + " sugar");   }

    void makeIveCream(int a, int b, int count) {
        int amount = 0;
        while ((this.milk >= a) && (this.sugar >= b)) {
            this.milk = this.milk - a;
            this.sugar = this.sugar - b;
            amount++;
            if(amount==count){
                break;
            }
        }
        if(count <= amount){
            System.out.println(" From the given parable, so much ice cream can be made = " + amount);
            System.out.println("Remaining products:" + this.milk + "  milk; " + this.sugar + " sugar");
        }else{
            System.out.println("You can't produce that much ice cream");
        }
    }
}