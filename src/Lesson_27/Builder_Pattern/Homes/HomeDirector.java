package Lesson_27.Builder_Pattern.Homes;

public class HomeDirector {


    public void createApartment(HomeBuilder bilder){
        bilder.setTypeOFHome(TypeOfHome.APARTMENT);
        bilder.setBathRoom("There is one bath room");
        bilder.setBedRoom("There are two bed room");
        bilder.setKitchen("There  is a small kitchen");
        bilder.setLivingRroom("There is a big living room");
        bilder.setBalcony("There is a balcony");
        bilder.setPrice("Prise started:" + TypeOfHome.APARTMENT.getPrice());
    }public void createHouse(HomeBuilder bilder){
        bilder.setTypeOFHome(TypeOfHome.HOUSE);
        bilder.setBathRoom("There are two bath room");
        bilder.setBedRoom("There are three bed room");
        bilder.setKitchen("There  is a small kitchen");
        bilder.setLivingRroom("There is a big living room");
        bilder.setGarage("There is a garage");
        bilder.setGarage("There is a garden");
        bilder.setPrice("Prise started:" + TypeOfHome.HOUSE.getPrice());
    }public void createCottage(HomeBuilder bilder){
        bilder.setTypeOFHome(TypeOfHome.COTTAGE);
        bilder.setBathRoom("There are three bath room");
        bilder.setBedRoom("There are three bed room");
        bilder.setKitchen("There  is a Big kitchen and a small kitchen");
        bilder.setDiningRoom("There is a dinning room");
        bilder.setLivingRroom("There are two big living room");
        bilder.setGarage("There is a big garage");
        bilder.setGarage("There are two garden");
        bilder.setPrice("Prise started:" + TypeOfHome.COTTAGE.getPrice());
    }public void createTownHouse(HomeBuilder bilder){
        bilder.setTypeOFHome(TypeOfHome.TOWNHOUSE);
        bilder.setBathRoom("There are two  bath room");
        bilder.setBedRoom("There are three bed room");
        bilder.setKitchen("There  is a small kitchen");
        bilder.setLivingRroom("There is a big living room");
        bilder.setGarage("There is a small garage");
        bilder.setGarage("There is a garden");
        bilder.setPrice("Prise started:" + TypeOfHome.TOWNHOUSE.getPrice());
    }public void createVilla(HomeBuilder bilder){
        bilder.setTypeOFHome(TypeOfHome.VILLA);
        bilder.setBathRoom("There are four bath room");
        bilder.setBedRoom("There are five bed room");
        bilder.setKitchen("There  are four kitchen");
        bilder.setLivingRroom("There are three living room and a small");
        bilder.setBalcony("There are three balcony");
        bilder.setGarage("There are two big garage");
        bilder.setGarage("There are three garden");
        bilder.setSwimmingPool("There is swimming pool");
        bilder.setPrice("Prise started:" + TypeOfHome.VILLA.getPrice());
    }
}
