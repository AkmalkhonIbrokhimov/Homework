package Lesson_28_29.LiskovSubstitution.Exemple_For_LS_Vehicle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Gentra","Chevralet");
        car.move();
        car.getInfo();
        Plane plane = new Plane("747","Boeing");
        plane.getInfo();
        plane.move();
    }
}
