package LessonEleven.TasksOFAbstractions.Task1;

public abstract class Shape {       // we are created abstract  class which is called Shape
    private  double a;     // There is created fields in type of Integer and  access modifier Private
    private  double b;     // There is created fields in type of Integer and  access modifier Private
    private  double radius;        // There is created fields in type of Integer and  access modifier Private

    public Shape(double a, double b) {        // There is created constructor of the "Shape" class in a public access modifier
        this.a = a;     // Assigning the value of the parameter "a" to the field "this.a"
        this.b = b;      // Assigning the value of the parameter "b" to the field "this.b"
    }

    public Shape(double radius) {      // There is created constructor of the "Shape" class in a public access modifier
        this.radius = radius;       // Assigning the value of the parameter "radius" to the field "this.radius"
    }


    abstract double getPrimetr();      // the  getPrimetr() method is declared in type of Integer which retuned value "primetr" of Shape
    abstract double getSquare();        // the  getPrimetr() method is declared in type of Integer which retuned value "Square" of Shape
    abstract double getSideCount();         // the  getPrimetr() method is declared in type of Integer which retuned  number of sides of the  Shape

    public double getRadius(){     // This method returns the value of the radius.The return type is Integer
        return radius;      //Return the value stored in the radius field.
    }
    public double getA(){   // This method returns the value of the A.The return type is Integer
        return a;    //Return the value stored in the a field.
    }
    public double getB(){   // This method returns the value of the radius.The return type is Integer
        return  b;      //Return the value stored in the radius field.
    }

}
