package Lesson_16.Task1_Fruit;

import java.util.Arrays;

public class Basket {
    private final int maxWeight;
    private int counterWeight;
    private Fruits[] fruits = new Fruits[]{};


    public Basket(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getCounterWeight() {
        return counterWeight;
    }

    public void setCounterWeight(int counterWeight) {
        this.counterWeight = counterWeight;
    }

    public String getFruits() {
        return Arrays.toString(fruits);
    }

    public boolean isEpty() {
        return (getCounterWeight() == 0);
    }

    public boolean isFuul() {
        return (getCounterWeight() == getMaxWeight());
    }

    public boolean addFruit(Fruits fruit) {
        int index = 0;
        if (getEmptySize() > fruit.getWeight()) {
            Fruits[] newFruits = new Fruits[fruits.length + 1];

            for (Fruits fruit1 : fruits) {
                newFruits[index++] = fruit1;
            }
            newFruits[index] = fruit;
            this.fruits = newFruits;
            setCounterWeight(fruit.getWeight());
            return true;
        }

        return false;
    }

    public boolean addFruits(Fruits[] outputFruits) {
        int weightSum = 0;
        for (Fruits fruit : outputFruits) {
            weightSum += fruit.getWeight();
            }
            if (getEmptySize() >= weightSum) {
                Fruits[] newFruits = new Fruits[fruits.length + outputFruits.length];
                int indeex = 0;
                for (Fruits f : fruits) {
                    newFruits[indeex++] = f;
                }
                for (Fruits f : outputFruits) {
                    newFruits[indeex++] = f;
                    }

                    this.fruits = newFruits;
                    setCounterWeight(weightSum);
                    return true;
                }
            return false;
            }




    public int getEmptySize() {
        return (getMaxWeight() - getCounterWeight());
    }

    public final void showInfo() {
        System.out.println("Savat boshmi :"+isEpty());
        System.out.println("Savat tolami :"+isFuul());
        System.out.println("Sizda "+getEmptySize()+" bo'sh joy mavjud");
        System.out.println("Savatdagi mevalar royhati:" + getFruits());

    }


}