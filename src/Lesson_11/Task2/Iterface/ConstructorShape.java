package Lesson_11.Task2.Iterface;

public abstract class ConstructorShape {
    private  double a;
    private  double b;
    private  double c;
    private  double radius;
    public  ConstructorShape(double radius){
        this.radius=radius;
    }
    public ConstructorShape(double a, double b){
        this.a = a;
        this.b = b;
    }
    public ConstructorShape(double a, double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }


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
