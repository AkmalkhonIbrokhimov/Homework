package Lesson_28_29.SingleResposibility.Example_For_Single_responsibility_Factory;

public class Factory {
    private String carName;
    private String carModel;

    public Factory(String carName, String carModel) {
        this.carName = carName;
        this.carModel = carModel;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void produceHeadlight(){
        System.out.println("This factory produces head light for cars");
    }
    public void produceWindow(){
        System.out.println("This factory produces window for cars");
    }
    public void creatCar(){
        System.out.println("This method  creates car");
    }
    public void buildCar(){
        System.out.println("This method  builds car");
    }

}
