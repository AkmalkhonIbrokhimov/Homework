package Lesson_27.Builder_Pattern.Homes;

public class Home {
    private final TypeOfHome typeOfHome;
    private final String bedRoom;
    private final String bathRoom;
    private final String kitchen;
    private final String livingRroom;
    private final String balcony;
    private final String  diningRoom;
    private final String garage;
    private final String garden;
    private final String swimmingPool;
    private final String  price;



    public Home(TypeOfHome typeOfHome, String bedRoom, String bathRoom, String kitchen, String livingRroom, String balcony, String diningRoom, String garage, String garden, String swimmingPool, String price) {
        this.typeOfHome = typeOfHome;
        this.bedRoom = bedRoom;
        this.bathRoom = bathRoom;
        this.kitchen = kitchen;
        this.livingRroom = livingRroom;
        this.balcony = balcony;
        this.diningRoom = diningRoom;
        this.garage = garage;
        this.garden = garden;
        this.swimmingPool = swimmingPool;
        this.price = price;
    }

    public TypeOfHome getTypeOfHome() {
        return typeOfHome;
    }

    public String getBedRoom() {
        return bedRoom;
    }
    public String getPrice() {
        return price;
    }

    public String getBathRoom() {
        return bathRoom;
    }

    public String getKitchen() {
        return kitchen;
    }

    public String getLivingRroom() {
        return livingRroom;
    }

    public String getBalcony() {
        return balcony;
    }

    public String getDiningRoom() {
        return diningRoom;
    }

    public String getGarage() {
        return garage;
    }

    public String getGarden() {
        return garden;
    }

    public String getSwimmingPool() {
        return swimmingPool;
    }

    @Override
    public String toString() {
        return "Home{" +
                "typeOfHome=" + typeOfHome +
                ", bedRoom='" + bedRoom + '\'' +
                ", bathRoom='" + bathRoom + '\'' +
                ", kitchen='" + kitchen + '\'' +
                ", livingRroom='" + livingRroom + '\'' +
                ", balcony='" + balcony + '\'' +
                ", diningRoom='" + diningRoom + '\'' +
                ", garage='" + garage + '\'' +
                ", garden='" + garden + '\'' +
                ", swimmingPool='" + swimmingPool + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
