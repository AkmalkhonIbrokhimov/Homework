package Lesson_19;

import Lesson_19.DB.KingBurgersDB;
import Lesson_19.DB.ProductPrice;
import Lesson_19.Product.*;
import Lesson_19.Product_Type.IngredientsType;
import Lesson_19.Product_Type.ProductType;
import Lesson_19.hamburger.Deluxe;
import Lesson_19.hamburger.Hamburger;
import Lesson_19.hamburger.Healty;
import Lesson_19.hamburger.Simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static  List<Ingredient> userChoseIngredient = new ArrayList<>();
    private static  List<Hamburger> userChoseBurgers = new ArrayList<>();
    public static void main(String[] args) {

        KingBurgersDB kingBurgersDB = KingBurgersDB.getInstance();

        List<BaseProduct> productList = new ArrayList<>();

        productList.add(new Meet(ProductType.MEET,8000,5));
        productList.add(new Bread(ProductType.BREAD,2000,8));
        productList.add(new Chicken(ProductType.CHICKEN,5000,3));
        productList.add((new Ingredient(IngredientsType.CHEESE,2000,8)));
        productList.add((new Ingredient(IngredientsType.LETTUCE,500,8)));
        productList.add((new Ingredient(IngredientsType.TOMATO,500,8)));


        Scanner scanner = new Scanner(System.in);
kingBurgersDB.getProductPrices();
        System.out.println(kingBurgersDB.getProductPrices());

        boolean isChooseHamburger = true;
        boolean isChooseHamburgerAgain = false;
        while (isChooseHamburger) {
            if (isChooseHamburgerAgain) {
                System.out.println("Burger yana tanlaysimi!");
                System.out.println("1)Simple 2)Healty 3)Deluxe 4)Quit");
            } else {
                System.out.println("Burger tanlang!");
                System.out.println("1)Simple 2)Healty 3)Deluxe 4)Quit");
            }
            switch (scanner.nextInt()){
                case 1 ->{
                    System.out.println("Ushbu burgerdan nechta tanlaysiz?");
                    int counterBurger = scanner.nextInt();
                    choseSimpleBurger(scanner,kingBurgersDB,counterBurger);
                    isChooseHamburgerAgain = true;
                }
                case 2->{
                    System.out.println("Ushbu burgerdan nechta tanlaysiz?");
                    int counterBurger = scanner.nextInt();
                    choseHealtyBurger(scanner,kingBurgersDB,counterBurger);
                    isChooseHamburgerAgain = true;
                }
                case 3->{
                    System.out.println("Ushbu burgerdan nechta tanlaysiz?");
                    int counterBurger = scanner.nextInt();
                    choseDeluxeBurger(counterBurger);
                    System.out.println("Ushbu burger da Ingredient tanlash mum kin emas");
                    isChooseHamburgerAgain = true;
                }
                case 4->{
                    isChooseHamburger = false;

                    System.out.println(" Sizni tanlovingiz yakulndi ");
                    System.out.println("Sizni tanlovingiz boyicha tanlangan burgerlar:");
                    System.out.println(userChoseBurgers);
                }
            }
        }
    }

    private static void choseDeluxeBurger( int counterBurger) {
                    Deluxe deluxeBurger = new Deluxe(counterBurger);
                    userChoseBurgers.add(deluxeBurger);
                    System.out.println(userChoseBurgers);
    }

    private static void choseHealtyBurger(Scanner scanner,KingBurgersDB kingBurgersDB, int counterBurger) {
        boolean isChooseIngredient = true;
        boolean isChooseIngredientAgain = false;
        while (isChooseIngredient){
            if (!isChooseIngredientAgain){
                System.out.println(" Burger uchun ingredient tanlaysimi ?");
                System.out.println(" 1) Ha 2) Yoq");
            }else {
                System.out.println(" Burger uchun ingredient  yana tanlaysimi ?");
                System.out.println(" 1) Ha 2) Yoq");
            }

            switch (scanner.nextInt()){
                case 1->{

                    for (int i = 0; i < IngredientsType.values().length; i++) {
                        System.out.println((i+1)+")"+IngredientsType.values()[i]+"| Narxi: " + getCost(IngredientsType.values()[i],kingBurgersDB));
                    }

                    int chooseIngredientUser = scanner.nextInt() - 1;
                    IngredientsType choseIngredientsType = IngredientsType.values()[chooseIngredientUser];
                    userChoseIngredient.add(new Ingredient(choseIngredientsType,1));
                    isChooseIngredientAgain = true;
                }
                case 2 ->{
                    isChooseIngredient = false;
                    isChooseIngredientAgain = false;
                    Healty healtyBurger = new Healty(counterBurger);
                    healtyBurger.addIngredient(userChoseIngredient);
                    userChoseBurgers.add(healtyBurger);
                    userChoseIngredient.clear();
                    System.out.println(userChoseBurgers);


                }
            }
        }
    }



    private static void  choseSimpleBurger(Scanner scanner,KingBurgersDB kingBurgersDB, int counterBurger) {
        boolean isChooseIngredient = true;
        boolean isChooseIngredientAgain = false;
        while (isChooseIngredient){
            if (!isChooseIngredientAgain){
                System.out.println(" Burger uchun ingredient tanlaysimi ?");
                System.out.println(" 1) Ha 2) Yoq");
            }else {
                System.out.println(" Burger uchun ingredient  yana tanlaysimi ?");
                System.out.println(" 1) Ha 2) Yoq");
            }

            switch (scanner.nextInt()){
                case 1->{

                    for (int i = 0; i < IngredientsType.values().length; i++) {
                        System.out.println((i+1)+")"+IngredientsType.values()[i]+"| Narxi: " + getCost(IngredientsType.values()[i],kingBurgersDB));
                    }

                    int chooseIngredientUser = scanner.nextInt() - 1;
                    IngredientsType choseIngredientsType = IngredientsType.values()[chooseIngredientUser];
                    userChoseIngredient.add(new Ingredient(choseIngredientsType,1));
                    isChooseIngredientAgain = true;
                }
                case 2 ->{
                    isChooseIngredient = false;
                    isChooseIngredientAgain = false;
                    Simple simpleBurger = new Simple(counterBurger);
                    simpleBurger.addIngredient(userChoseIngredient);
                    userChoseBurgers.add(simpleBurger);
                    userChoseIngredient.clear();
                    System.out.println(userChoseBurgers);
                    calcuateCosts(kingBurgersDB.getProductPrices());

                }
            }
        }


    }

    private static void calcuateCosts(List<ProductPrice> productPrices) {
        for (Hamburger userChoseBurger : userChoseBurgers) {
            System.out.println(HelperForCalculate.calcuateCost(productPrices, userChoseBurger));
        }
    }

    private static void getSumm() {


   }

    private static int getCost(IngredientsType ingredientsType, KingBurgersDB kingBurgersDB) {
        for (int i = 0; i < kingBurgersDB.getProductList().size(); i++) {
            BaseProduct baseProduct = kingBurgersDB.getProductList().get(i);
            if(baseProduct.getIngredientsType() != null){
                if( baseProduct.getIngredientsType().equals(ingredientsType)){
                    return baseProduct.getPrice();
                }
            }
        }
        return 0;

    }


}
