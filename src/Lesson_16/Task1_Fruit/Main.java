package Lesson_16.Task1_Fruit;

public class Main {
    public static void main(String[] args) {
        Apples apples = new Apples("apple", "green", 12);
        Peach peach = new Peach("peach", "yellow", 40);
        Pomegranate pomegranate = new Pomegranate("pomegranate", "red", 55);
        Fruits [] fruits = {apples, peach, pomegranate};

        Basket basket = new Basket(1000);

        System.out.println(basket.addFruit(apples));
        System.out.println(basket.addFruits(fruits));
        basket.showInfo();


    }

}
