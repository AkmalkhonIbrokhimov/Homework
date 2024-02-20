package Lesson_28.SingleResposibility.Example_For_Single_responsibility_SHop;

import java.util.ArrayList;

public class DB {
   private static DB instance = null;
   ArrayList<ProductType> product = new ArrayList<ProductType>();
    private DB(){}

    public static DB getInstance(){
        if(instance == null){
            instance = new DB();
        }
        return instance;
    }

}
