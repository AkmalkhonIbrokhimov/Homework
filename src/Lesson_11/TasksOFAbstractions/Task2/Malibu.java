package Lesson_11.TasksOFAbstractions.Task2;

public class Malibu extends Car{

    public Malibu(int maxCapacity, double busyCapacity, double fuelConsumption) {
        super(maxCapacity, busyCapacity, fuelConsumption);
    }
    @Override
    public double maxLongestWay() {
        return (getBusyCapacity()/getFuelConsumption()*100);
    }

    @Override
    public double getMaxOilFromRefill() {
        return (getMaxCapacity()-getBusyCapacity());
    }
}
