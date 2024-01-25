package Lesson_19.Product;

import Lesson_19.Product_Type.IngredientsType;
import Lesson_19.Product_Type.ProductType;

public abstract class BaseProduct {
private ProductType productType;
private IngredientsType ingredientsType;
private  int price;
private  int count;

    public BaseProduct(ProductType productType, IngredientsType ingredientsType, int price, int count) {
        this.productType = productType;
        this.ingredientsType = ingredientsType;
        this.price = price;
        this.count = count;
    }
    public BaseProduct(ProductType productType, int price, int count) {
        this.productType = productType;
        this.price = price;
        this.count = count;
    }
    public BaseProduct(IngredientsType ingredientsType, int price, int count) {
        this.ingredientsType = ingredientsType;
        this.price = price;
        this.count = count;
    }
    public BaseProduct(IngredientsType ingredientsType, int count) {
        this.ingredientsType = ingredientsType;
        this.count = count;
    }
    public BaseProduct(ProductType productType, int count) {
        this.productType = productType;
        this.count = count;
    }



    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public IngredientsType getIngredientsType() {
        return ingredientsType;
    }

    public void setIngredientsType(IngredientsType ingredientsType) {
        this.ingredientsType = ingredientsType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void decrementCount(int count){
        this.count -= count;
    }
    public void incrementCount(int count){
        this.count += count;
    }

    @Override
    public String toString() {
        return "BaseProduct{" +
                "productType=" + productType +
                ", ingredientsType=" + ingredientsType +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
