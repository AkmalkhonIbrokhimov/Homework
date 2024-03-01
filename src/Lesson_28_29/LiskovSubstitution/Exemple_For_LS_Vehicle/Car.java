package Lesson_28_29.LiskovSubstitution.Exemple_For_LS_Vehicle;

public class Car implements Vehicle,MovingVehicle{
   private String  name;
   private  String model;

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public void move() {
        System.out.println(name + " is moving in the road");
    }

    @Override
    public void getInfo() {
        System.out.println("The "+name +"  is one of model "+model);
    }
}
