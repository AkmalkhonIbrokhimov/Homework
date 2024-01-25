package Lesson_16.Task2_Car;

public class Main {
    public static void main(String[] args) {
        Car car =  Car.getInstance("Gentera", 80, 25);
        Car car1 = Car.getInstance("Nexia 3", 70, 15);


        System.out.println(car.isActive());
        System.out.println(car.getEmptySize());
        System.out.println(car.getBusycapacity());
        System.out.println(car.getMaxway(2));
        System.out.println(car.refuel(60));
//TODO Equals da ikki obyektni tekshirib  singlton patterin ishladimi yoqmi tekshira olamiz
        System.out.println(car.equals(car1));
    }

}
