package lessonSeven.Car;

public class Car {
    int weight;
    int fuelCapacity;
    int  brakingDistans;
    public Car(int weight,int fuelCapacity,int brakingDistans){
        this.brakingDistans = brakingDistans;
        this.fuelCapacity = brakingDistans;
        this.weight = weight;
    }
    void showInfo(){
        System.out.println("Og'irligi"+weight);
        System.out.println("Yoqilg'i Imkoniyatlari"+fuelCapacity);
        System.out.println("Tormozlash masofalari"+brakingDistans);
    }
}
class Malibu extends Car{
    String carName;
    public Malibu(String carName,int weight,int fuelCapacity,int brakingDistans){
        super(weight,fuelCapacity,brakingDistans);
        this.carName = carName;
    }

    @Override
    void showInfo() {
        System.out.println("Mashina nomi"+carName);
        super.showInfo();
    }
}
class Captiva extends Car{
    String carName;
    public Captiva(String carName,int weight,int fuelCapacity,int brakingDistans){
        super(weight,fuelCapacity,brakingDistans);
        this.carName = carName;
    }

    @Override
    void showInfo() {
        System.out.println("Mashina nomi"+carName);
        super.showInfo();
    }
}

