package LessonEleven.TasksOFAbstractions.Task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Malibu(90,61.5,12);
        System.out.println(car.maxLongestWay());
        System.out.println(car.getMaxOilFromRefill());
        Captiva captiva = new Captiva(110,77.7,15);
        System.out.println(captiva.maxLongestWay());
        System.out.println(captiva.getMaxOilFromRefill());

    }
}
