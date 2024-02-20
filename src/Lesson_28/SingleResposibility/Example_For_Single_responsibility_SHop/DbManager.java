package Lesson_28.SingleResposibility.Example_For_Single_responsibility_SHop;

public class DbManager {
    private DB db;

    public DbManager(DB db) {
        this.db = db;
    }
    public boolean addProduct(String nameProduct, String typeProduct, double priceProduct){
        System.out.println("This method add product to cash DB");
        return true;
    }
}
