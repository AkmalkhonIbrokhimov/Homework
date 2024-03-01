package Lesson_28_29.InterfaceSegregation.Exemple_For_IS_Toy;

public class ToyBird implements Toy,FlyingToy,MovingToy{
    private String name;
    private String color;
    private int price;

    public ToyBird(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println("This toy can fly");
    }

    @Override
    public void move() {
        System.out.println("This toy can move");
    }

    @Override
    public int setPrice(int price) {
        return this.price = price;
    }

    @Override
    public String getInfo() {
        String info ="Name: " + this.name + "; Color: " + this.color +"; Price: " + this.price;
        return info;
    }

    @Override
    public String setColor(String color) {
        return this.color = color;
    }


}
