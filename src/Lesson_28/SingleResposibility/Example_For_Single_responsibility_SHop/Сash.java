package Lesson_28.SingleResposibility.Example_For_Single_responsibility_SHop;

public class Сash {
    public String searchProduct(String name){
        System.out.println("This method is searching products");
        return name;
    }
    public double sumAllProducts(Double[] productPrices){
        System.out.println("This method is calculated prices of products");
        double sum = Double.MAX_VALUE;
        return sum;
    }
}
