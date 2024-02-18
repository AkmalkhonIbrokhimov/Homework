package Lesson_27.Builder_Pattern.Homes;

public class ConcreatHomeBuilder implements HomeBuilder{
    private  TypeOfHome typeOfHome;
    private  String bedRoom;
    private  String bathRoom;
    private  String kitchen;
    private  String livingRroom;
    private  String balcony;
    private  String  diningRoom;
    private  String garage;
    private  String garden;
    private  String swimmingPool;
    private String price;
    @Override
    public void setTypeOFHome(TypeOfHome typeOfHome) {
        this.typeOfHome = typeOfHome;
    }
    @Override
    public void setBedRoom(String bedRoom) {
        this.bedRoom = bedRoom;
    }

    @Override
    public void setBathRoom(String bathRoom) {
        this.bathRoom = bathRoom;
    }

    @Override
    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void setLivingRroom(String livingRroom) {
        this.livingRroom = livingRroom;
    }

    @Override
    public void setBalcony(String balcony) {
        this.balcony = balcony;
    }

    @Override
    public void setDiningRoom(String diningRoom) {
        this.diningRoom = diningRoom;
    }

    @Override
    public void setGarage(String garage) {
        this.garage = garage;
    }

    @Override
    public void setGarden(String garden) {
        this.garden = garden;
    }

    @Override
    public void setSwimmingPool(String swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    @Override
    public void setPrice(String price) {
        this.price = price;
    }

    public Home build(){
        return new Home(typeOfHome,bedRoom,bedRoom,kitchen,livingRroom,balcony,diningRoom,garage,garden,swimmingPool,price);
    }
}
