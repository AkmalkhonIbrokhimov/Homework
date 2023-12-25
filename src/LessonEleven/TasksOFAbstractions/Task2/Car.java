package LessonEleven.TasksOFAbstractions.Task2;

public abstract class Car {
    private double  maxCapacity;
    private double busyCapacity;
    private double fuelConsumption;

    public Car(int maxCapacity, double busyCapacity, double fuelConsumption) {
        this.maxCapacity = maxCapacity;
        this.busyCapacity = busyCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    protected abstract double maxLongestWay();
   protected abstract double getMaxOilFromRefill();

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public double getBusyCapacity() {
        return busyCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
