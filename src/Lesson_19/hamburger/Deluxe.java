package Lesson_19.hamburger;

import Lesson_19.Product.Ingredient;
import Lesson_19.Product_Type.IngredientsType;

import java.util.ArrayList;
import java.util.List;

public class Deluxe implements Hamburger{
    private  int count;
    private List<Ingredient> ingredientList = new ArrayList<>();

    public Deluxe(int count) {
        this.count = count;
        ingredientList.add(new Ingredient(IngredientsType.LETTUCE, 1));
        ingredientList.add(new Ingredient(IngredientsType.CHEESE, 1));
        ingredientList.add(new Ingredient(IngredientsType.MAYONNAISE, 1));
    }



    @Override
    public String toString() {
        return "Deluxe{" +
                "count=" + count +
                ", ingredientList=" + ingredientList +
                '}';
    }
}
