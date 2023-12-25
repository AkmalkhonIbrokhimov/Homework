package LessonEleven.TasksOFAbstractions.Task2;

public class Captiva extends Car{
    public Captiva(int maxCapacity, double busyCapacity, double fuelConsumption) {
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
