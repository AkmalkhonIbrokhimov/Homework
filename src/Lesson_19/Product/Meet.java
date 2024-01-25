package Lesson_19.Product;

import Lesson_19.Product_Type.IngredientsType;
import Lesson_19.Product_Type.ProductType;

public class Meet extends BaseProduct{
    public Meet(ProductType productType, int price, int count) {
        super(productType,  price, count);
    }

    public Meet(ProductType productType, int count) {
        super(productType, count);
    }
}
