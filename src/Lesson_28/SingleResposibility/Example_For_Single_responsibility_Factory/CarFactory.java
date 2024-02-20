package Lesson_28.SingleResposibility.Example_For_Single_responsibility_Factory;

public class CarFactory {
    private String carName;
    private String carModel;

    public CarFactory(String carName, String carModel) {
        this.carName = carName;
        this.carModel = carModel;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarModel() {
        return carModel;
    }
    public void creatCar(){
        System.out.println("This method  creates car");
    }
    public void buildCar(){
        System.out.println("This method  builds car");
    }
}
