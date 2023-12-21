package LessonEleven.Task2.Iterface;

public class Circle extends ConstructorShape implements Shape{

    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI*getRadius();
    }

    @Override
    public double getArea() {
        return Math.PI*getRadius()*getRadius();
    }

}
