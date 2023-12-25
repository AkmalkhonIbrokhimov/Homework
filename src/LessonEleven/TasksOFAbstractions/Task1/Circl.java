package LessonEleven.TasksOFAbstractions.Task1;

import LessonEleven.TasksOFAbstractions.Task1.Shape;

public class Circl extends Shape {
       public Circl(int radius) {
        super(radius);
    }

    @Override
    double getPrimetr() {
        return 2*Math.PI*getRadius();
    }

    @Override
    double getSquare() {
        return Math.PI*getRadius()*getRadius();
    }

    @Override
    double getSideCount() {
        return 0;
    }
}
