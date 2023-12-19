package LessonEleven.Task2;

public class Circle extends Shape {

   public Circle(double radius){
       super(radius);
   }
    @Override
    public double getPerimtr() {
        return 2*Math.PI*getRadius();
    }

    @Override
    public double getArea() {
        return Math.PI*getRadius()*getRadius();
    }
}
