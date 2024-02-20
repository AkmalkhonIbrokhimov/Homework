package Lesson_28.InterfaceSegregation.Exemple_For_IS_Toy;

public class ToyHouse implements Toy{
    private String name;
    private int price;
    private String color;

    public ToyHouse(String name) {
        this.name = name;
    }

    @Override
    public int setPrice(int price) {
        return this.price=price;
    }

    @Override
    public String getInfo() {
        String info ="Name: " + this.name + "; Color: " + this.color +"; Price: " + this.price;
        return info;
    }

    @Override
    public String setColor(String color) {
        return this.color=color;
    }

    @Override
    public String toString() {
        return "ToyHouse{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
