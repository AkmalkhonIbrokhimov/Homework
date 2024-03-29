package Lesson_28_29.OpenClose.Example_for_OC_Shape;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }

    @Override
    public double area() {
        double p = (a+b+c)/2;
        return (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
