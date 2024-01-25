package Lesson_8.Task2;

import java.util.Arrays;

public class Basket {
    private Capacity capacity;
    private Fruit fruit;
    private Fruit[] fruits;


    public Basket(Capacity capacity) {
        this.capacity = capacity;
        this.fruits = new Fruit[]{};
    }

   /* public Basket(Capacity capacity, Fruit fruit) {
        this.capacity = capacity;
        this.fruit = fruit;
        this.fruits = new Fruit[]{};
    }*/

    public boolean isFull() {
        int sizeOfArray = 0;
        for (Fruit value : fruits) sizeOfArray += value.getWeight();
        if (sizeOfArray == capacity.getCapacity()) {
            //showMessage("Your basket is full");
            return true;
        } else {
            //showMessage("Your basket is not  full, you have free space in basket");
            return false;
        }
    }

    public boolean isEmpty() {
       /* int sizeOfArray=0;
        for (Fruit value:fruits)
            sizeOfArray+=value.getWeight();
        if(sizeOfArray<capacity.getCapacity()){
            showMessage("Your basket is empty");
            return true;
        }else{
            showMessage("Your basket is not  epty,you do not  have free space in basket");
            return false;}*/
        return fruits.length == 0;

    }
public boolean haveFreeSpace(Fruit[] newFruits){
    int sizeOfArray = 0;
    int newSizeOfArray = 0;
     for (Fruit value : this.fruits) sizeOfArray += value.getWeight();

    for (Fruit value : newFruits) newSizeOfArray += value.getWeight();
    int excessWeight;
    if ((newSizeOfArray+sizeOfArray) > this.capacity.getCapacity()) {
        excessWeight = this.capacity.getCapacity()- newSizeOfArray - sizeOfArray;
        String result = " You don't have free space in basket. You are overweight " + Integer.toString(excessWeight);
        showMessage(result);
        return false;
    }else {
        excessWeight = this.capacity.getCapacity() - newSizeOfArray+sizeOfArray;
        return true;
    }

}
    public void showMessage(String message) {
        System.out.println(message);
    }

    public boolean addFrtuit(Fruit fruit) {
        int sizeOfBasket;
        if (haveFreeSpace(fruits)) {
            if (fruits.length != 0) {
                Fruit[] newArray = new Fruit[this.fruits.length + 1];
                int index = 0;
                for (int i = 0; i < fruits.length; i++) newArray[index++] = fruits[i];
                newArray[index] = fruit;
                this.fruits = newArray;
            } else {
                Fruit[] newArray = new Fruit[1];
                newArray[0] = fruit;
                this.fruits = newArray;

            }
            showFruits();
            return true;
        } else {
            showMessage("false");
            return false;
        }
    }

    public boolean addFruits(Fruit[] newFruits){

        if(haveFreeSpace(newFruits)){
            if (fruits.length != 0) {
                Fruit[] newArray = new Fruit[this.fruits.length + newFruits.length];
                int index = 0;
                for (int i = 0; i < fruits.length; i++) newArray[index++] = fruits[i];
                for (int i = 0; i < newFruits.length; i++) newArray[index++] = newFruits[i];
                this.fruits = newArray;
            } else {
                Fruit[] newArray = new Fruit[newFruits.length];
                for (int i = 0; i < newFruits.length; i++) newArray[i] = newFruits[i];
                this.fruits = newArray;
            }
            showFruits();
            return true;
        }else{
            return false;
        }
    }
   public void showFruits() {
       System.out.println(Arrays.toString(fruits));
       int sizeOfArray = 0;
       for (Fruit value : fruits) sizeOfArray += value.getWeight();
       System.out.println(sizeOfArray);
    }


}

