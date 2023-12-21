package LessonEleven.Task2.Abstract;

public class Rectangle extends Shape {

    public Rectangle(double a, double b){
        super(a, b);
    }
    @Override
    public double getPerimtr() {
        return 2*(getA()+getB());
    }

    @Override
    public double getArea() {
        return getA()*getB();
    }
}
