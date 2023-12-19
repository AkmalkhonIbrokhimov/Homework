package LessonEleven.Task2;

public  abstract class Shape {
    private double a;
    private  double b;
    private  double c;
    private  double radius;
    public Shape(double radius){
        this.radius=radius;
    };
    public Shape(double a, double b){
        this.a = a;
        this.b = b;
    }
    public Shape(double a, double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public abstract double getPerimtr();
    public abstract double getArea();

    public double getA() {
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public  double getRadius(){
        return radius;
    }
}
