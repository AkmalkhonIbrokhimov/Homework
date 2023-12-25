package LessonEleven.TasksOFAbstractions.Task1;

public class Rectangle extends Shape{
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double getPrimetr() {
       return  2*(getA()+getB());
    }

    @Override
    double getSquare() {
        return getA()*getB();
    }

    @Override
    double getSideCount() {
        return 4;
    }

}
