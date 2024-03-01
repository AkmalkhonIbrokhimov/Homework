package Lesson_19.DB;

import Lesson_19.Product.*;
import Lesson_19.Product_Type.IngredientsType;
import Lesson_19.Product_Type.ProductType;

import java.util.ArrayList;
import java.util.List;

public class KingBurgersDB {
    private static KingBurgersDB instanke = null;
    private List<BaseProduct> productList = new ArrayList<>();
    private List<ProductPrice> productPrices = new ArrayList<>();
    private KingBurgersDB(){
        productList.add(new Meet(ProductType.MEET,8000,10));
        productList.add(new Bread(ProductType.BREAD,2000,10));
        productList.add(new Chicken(ProductType.CHICKEN,5000,10));
        productList.add((new Ingredient(IngredientsType.CHEESE,2000,10)));
        productList.add((new Ingredient(IngredientsType.LETTUCE,500,10)));
        productList.add((new Ingredient(IngredientsType.TOMATO,500,10)));
        productList.add((new Ingredient(IngredientsType.ONION,300,10)));
        productList.add((new Ingredient(IngredientsType.PICKLES,400,10)));
        productList.add((new Ingredient(IngredientsType.KETCHUP,300,10)));
        productList.add((new Ingredient(IngredientsType.MUSTARD,500,10)));
        productList.add((new Ingredient(IngredientsType.MAYONNAISE,400,10)));

    }
    public  void collectPrice(List<BaseProduct> products){
        for (BaseProduct product : products) {
            if(product.getProductType() != null){
                productPrices.add(new ProductPrice(product.getProductType().name(),product.getPrice()));
            }
            if(product.getIngredientsType() != null){
                productPrices.add(new ProductPrice(product.getIngredientsType().name(),product.getPrice()));
            }
        }
    }
    public List<ProductPrice> getProductPrices() {
        return productPrices;
    }

    public void setProductList(List<BaseProduct> products) {
        firstLoop:
        for (int i = 0; i < products.size(); i++) {
            BaseProduct inputBaseProduct = products.get(i);
            secondLoop:
            for (int j = 0; j < getProductList().size(); j++) {
                BaseProduct product = getProductList().get(j);
                if(inputBaseProduct.getProductType() != null && product.getProductType() != null){
                    if (inputBaseProduct.getProductType().equals(product.getProductType())) {
                        product.incrementCount(inputBaseProduct.getCount());
                        break secondLoop;
                    }
                }if(inputBaseProduct.getIngredientsType() != null && product.getIngredientsType() != null){
                    if (inputBaseProduct.getIngredientsType().equals(product.getIngredientsType())){
                        product.incrementCount(inputBaseProduct.getCount());
                        break secondLoop;
                    }
                }

            }
        }
    }

    public List<BaseProduct> getProductList() {
        return productList;
    }

    public static KingBurgersDB getInstance(){
        if(instanke == null){
            instanke = new KingBurgersDB();
        }
        return instanke;
    }

    @Override
    public String toString() {
        return "KingBurgersDB{" +
                "productList=" + productList +
                ", productPrices=" + productPrices +
                '}';
    }
}
