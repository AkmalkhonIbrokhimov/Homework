package LessonEleven.Task2.Iterface;

public class Triangle extends ConstructorShape implements Shape  {
    public Triangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double getPerimetr() {
        return getA()+getB()+getC();
    }

    @Override
    public double getArea() {
        double perimetr = getA()+getB()+getC();
        return Math.sqrt(perimetr*(perimetr-getA())*(perimetr-getB())*(perimetr-getC()));
    }
}
