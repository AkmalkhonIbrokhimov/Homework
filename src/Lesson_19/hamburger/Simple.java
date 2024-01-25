package Lesson_19.hamburger;

import Lesson_19.Product.Ingredient;
import Lesson_19.Product_Type.IngredientsType;

import java.util.ArrayList;
import java.util.List;

public class Simple implements Hamburger{
    private  int count;
    private List<Ingredient> ingredientList = new ArrayList<>();

    public Simple( int count) {
        this.count = count;
        ingredientList.add(new Ingredient(IngredientsType.LETTUCE, 1));
    }

    public boolean addIngredient(List<Ingredient> ingredients){
        if(!ingredients.isEmpty()){
            ingredientList.clear();
            ingredientList.addAll(ingredients);
        return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Simple{" +
                "count=" + count +
                ", ingredientList=" + ingredientList +
                '}';
    }
}
