package Lesson_19.Product;

import Lesson_19.Product_Type.IngredientsType;
import Lesson_19.Product_Type.ProductType;

public class Bread extends BaseProduct{
    public Bread(ProductType productType, int price, int count) {
        super(productType, price, count);
    }

    public Bread(ProductType productType, int count) {
        super(productType, count);
    }
}

