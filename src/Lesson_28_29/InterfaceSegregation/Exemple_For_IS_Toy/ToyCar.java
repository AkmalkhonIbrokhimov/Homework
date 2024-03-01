package Lesson_28_29.InterfaceSegregation.Exemple_For_IS_Toy;

public class ToyCar implements Toy,MovingToy{

    private String name;
    private String color;
    private int price;

    public ToyCar(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "ToyCar{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void move() {
        System.out.println("The Car" + name + " is moving");
    }
}
