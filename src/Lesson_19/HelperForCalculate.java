package Lesson_19;

import Lesson_19.DB.ProductPrice;
import Lesson_19.Product.Ingredient;
import Lesson_19.Product_Type.ProductType;
import Lesson_19.hamburger.Deluxe;
import Lesson_19.hamburger.Hamburger;
import Lesson_19.hamburger.Healty;
import Lesson_19.hamburger.Simple;

import java.util.List;

public class HelperForCalculate {
    private Ingredient ingredient;
    public static String calcuateCost(List<ProductPrice> productPrices, Hamburger hamburger) {
        if (hamburger instanceof Simple) {
            int summ = 0;
            summ += getProductCost(productPrices, ProductType.MEET.name());
            summ += getProductCost(productPrices, ProductType.BREAD.name());
            for (Ingredient ingredient : ((Simple) hamburger).getIngredientList()) {
               summ += getProductCost(productPrices, ingredient.getIngredientsType().name());
            }
            String message = "Narx:" + summ*((Simple) hamburger).getCount()+" so'm boldi";
            return message;
        }
        if (hamburger instanceof Deluxe) {
            int summ = 0;
            summ += getProductCost(productPrices, ProductType.MEET.name());
            summ += getProductCost(productPrices, ProductType.BREAD.name());
            for (Ingredient ingredient : ((Deluxe) hamburger).getIngredientList()) {
                summ += getProductCost(productPrices, ingredient.getIngredientsType().name());
            }
            String message = "Narx:" + summ*((Deluxe) hamburger).getCount()+" so'm boldi";
            return message;
        }
        if (hamburger instanceof Healty) {
            int summ = 0;
            summ += getProductCost(productPrices, ProductType.MEET.name());
            summ += getProductCost(productPrices, ProductType.BREAD.name());
            for (Ingredient ingredient : ((Healty) hamburger).getIngredientList()) {
                summ += getProductCost(productPrices, ingredient.getIngredientsType().name());
            }
            String message = "Narx:" + summ*((Healty) hamburger).getCount()+" so'm boldi";
            return message;
        }
        return "";
    }
    private  static int getProductCost(List<ProductPrice> productPrices,String productName){
        for (ProductPrice productPrice : productPrices){
            System.out.println(productPrice.getProductName());
            if(productName.equals(productPrice.getProductName())){
                System.out.println(productPrice.getPrice());
                return productPrice.getPrice();
            }
        }
        return 0;
    }


}
