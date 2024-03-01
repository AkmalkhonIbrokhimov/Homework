package Lesson_28_29.InterfaceSegregation.Exemple_For_IS_Toy;

public class MAin {
    public static void main(String[] args) {
        ToyBird toyBird = new ToyBird("Parrot");
        toyBird.setColor("Blue");
        toyBird.setPrice(150_000);
        System.out.println(toyBird.getInfo());
        toyBird.fly();
        toyBird.move();
        System.out.println("====================================================");
        ToyCar toyCar = new ToyCar("Macvin");
        toyCar.setColor("Red");
        toyCar.setPrice(100_000);
        System.out.println(toyCar.getInfo());
        toyCar.move();
        System.out.println("====================================================");
        ToyHouse toyHouse = new ToyHouse("Lego House");
        toyHouse.setColor("Blue,Grin,Yellow and Red");
        toyHouse.setPrice(300_000);
        System.out.println(toyHouse.getInfo());
    }
}
