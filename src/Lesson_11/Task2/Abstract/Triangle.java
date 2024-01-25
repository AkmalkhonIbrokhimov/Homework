package Lesson_11.Task2.Abstract;

public class Triangle extends Shape {
    public Triangle(double a, double b,double c){
        super(a,b,c);
    }

    @Override
    public double getPerimtr() {
        return getA()+getB()+getC();
    }

    @Override
    public double getArea() {
        double perimetr = getA()+getB()+getC();
        return Math.sqrt(perimetr*(perimetr-getA())*(perimetr-getB())*(perimetr-getC()));
    }

}
