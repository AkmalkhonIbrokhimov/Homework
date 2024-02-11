package Lesson_25;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList1 = new MyArrayList<>();
        myArrayList1.add(1);
        myArrayList1.add(2);
        myArrayList1.add(3);
        myArrayList1.add(4);
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(11);
        myArrayList.add(21);
        myArrayList.add(31);
        myArrayList.add(41);
        myArrayList.add(41);
        myArrayList.add(41);
       /* myArrayList.addAll(myArrayList1);
        System.out.println(myArrayList);
        System.out.println(myArrayList.cotainsAll(myArrayList1));
        System.out.println(myArrayList);
        System.out.println(myArrayList.indexOf(5));
        System.out.println(myArrayList);
        System.out.println(myArrayList.getIndex(0));
        System.out.println(myArrayList);
        System.out.println(myArrayList.remove(110));
        System.out.println(myArrayList);
        System.out.println(myArrayList.set(0,1));
        System.out.println(myArrayList);*/
        System.out.println(myArrayList.addAll(0, myArrayList1));

        System.out.println(myArrayList);

    }
}
