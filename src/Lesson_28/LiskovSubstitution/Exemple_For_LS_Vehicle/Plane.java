package Lesson_28.LiskovSubstitution.Exemple_For_LS_Vehicle;

public class Plane implements Vehicle,MovingVehicle{
    private String  name;
    private  String model;

    public Plane(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public void move() {
        System.out.println(name+" is flaying in the air");
    }

    @Override
    public void getInfo() {
        System.out.println("The "+name +" is one of model"+model);
    }
}
