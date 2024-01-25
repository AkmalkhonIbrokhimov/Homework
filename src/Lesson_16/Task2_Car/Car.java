package Lesson_16.Task2_Car;
public class Car {
    private  String name;
    private  int maxCapacity;
    private int busycapacity;
    private static Car singlton = null;


    private Car(String name, int maxCapacity, int busycapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.busycapacity = busycapacity;
    }


    public static Car getInstance(String name, int maxCapacity, int busycapacity){
        if (singlton == null){
            singlton = new Car(name, maxCapacity, busycapacity);
        }
        return singlton;
    }

    public String getName() { return name;}
    public int getMaxCapacity() { return maxCapacity; }
    public int getBusycapacity() { return busycapacity;}
    public void setBusycapacity(int busycapacity) { this.busycapacity = busycapacity; }


    public boolean isActive(){
        return (getEmptySize()!=0);
    }
    public int getEmptySize(){
        return (maxCapacity-busycapacity);
    }
    public boolean refuel( int aadPetrol){
        if(getEmptySize()>=aadPetrol){
            busycapacity+=aadPetrol;
            return true;
        }
        return false;

    }
    public int getMaxway(int value){
        return (busycapacity*value);
    }


}
