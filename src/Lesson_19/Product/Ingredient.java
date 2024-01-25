package Lesson_19.Product;

import Lesson_19.Product_Type.IngredientsType;

public class Ingredient extends BaseProduct{
    public Ingredient(IngredientsType ingredientsType, int price, int count) {
        super(ingredientsType, price, count);
    }

    public Ingredient(IngredientsType ingredientsType, int count) {
        super(ingredientsType, count);
    }
}
