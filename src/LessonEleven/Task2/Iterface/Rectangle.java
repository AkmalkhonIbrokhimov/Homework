package LessonEleven.Task2.Iterface;

public  class Rectangle extends ConstructorShape implements  Shape{
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double getPerimetr() {
        return 2*(getA()+getB());
    }

    @Override
    public double getArea() {
        return getA()*getB();
    }
}
