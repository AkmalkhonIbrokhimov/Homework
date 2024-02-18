package Lesson_27.Builder_Pattern.Homes;

public interface HomeBuilder {

    void setTypeOFHome(TypeOfHome typeOfHome);
    void setBedRoom(String bedRoom);
    void setBathRoom(String bathRoom);
    void setKitchen(String kitchen);
    void setLivingRroom(String livingRroom);
    void setBalcony(String balcony);
    void setDiningRoom(String diningRoom);
    void setGarage(String garage);
    void setGarden(String garden);

    void setSwimmingPool(String swimmingPool);
    void setPrice(String price);

}
