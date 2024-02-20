package Lesson_28.OpenClose.Example_for_OC_Shape;

public class Rectangle implements Shape{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double perimeter() {
        return 2*(a+b);
    }

    @Override
    public double area() {
        return a*b;
    }
}
