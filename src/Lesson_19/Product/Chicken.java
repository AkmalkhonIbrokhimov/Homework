package Lesson_19.Product;

import Lesson_19.Product_Type.ProductType;

public class Chicken extends BaseProduct{
    public Chicken(ProductType productType, int price, int count) {
        super(productType, price, count);
    }

    public Chicken(ProductType productType, int count) {
        super(productType, count);
    }
}
