package Lesson_25;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class MyArrayList<E>{
    private Object[] myArrayList;
    private static final int defoltCapasity = 10;
    private int size;

    public MyArrayList(){
        this.myArrayList = new Object[defoltCapasity];
    }


    MyArrayList(int userCapacity){
        if (userCapacity > 0) {
            this.myArrayList = new Object[userCapacity];
        } else if (userCapacity == 0) {
            this.myArrayList = new Object[]{};
        }
    }

    public E getIndex(int index){
        if(index>myArrayList.length){
            return null;
        }
        for (int i = 0; i < myArrayList.length; i++) {
            if(myArrayList[i]==myArrayList[index]){
                return (E) myArrayList[index];
            }
        }
        return null;
    }
    public  void ensureCapacity(int capacity){
        int newCapacity;
        if(myArrayList.length <= capacity){
            newCapacity = myArrayList.length*3/2+1;
            Object[] newArray = new Object[newCapacity];
            for (int i = 0; i < myArrayList.length; i++) {
                newArray[i] = myArrayList[i];
            }
            myArrayList = newArray;
        }
    }
    public int getSize() {
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean add(E e){
        ensureCapacity(size+1);
        myArrayList[size++] = e;
        return true;
    }
    public  boolean add(int index,E e){
        ensureCapacity(size+1);
        if(myArrayList[index]==null){
            myArrayList[index]=e;
            size++;
            return true;
        }else {
            Object[] objects = new Object[myArrayList.length];
            int intindex=0;
            for (int i = 0; i < myArrayList.length-1; i++) {
                if(i==index){
                    objects[intindex++]=e;
                    objects[intindex++] = myArrayList[i];
                } else {
                    objects[intindex++] = myArrayList[i];
                }

            }

            myArrayList = objects;
            size++;
        }
        return true;
    }
    public boolean addAll(MyArrayList<E> elements){
        int lengthElement = elements.getSize();
        if(lengthElement==0){
            return false;
        }else {
            ensureCapacity(size+lengthElement);
            for (int i = 0; i < lengthElement; i++) {
                myArrayList[size++]= elements.getIndex(i);
            }
            return true;
        }
    }
    public  boolean addAll(int index, MyArrayList<E> elements){
        int lengthElement = elements.getSize();
        ensureCapacity(size+lengthElement);
        if(lengthElement==0){
            return false;
        }else if(index == size) {
            for (int i = 0; i < lengthElement; i++) {
                myArrayList[size++]= elements.getIndex(i);
            }
            return true;
        }else {
                Object[] objects = new Object[myArrayList.length+lengthElement];
                int intindex=0;
            for (int j = 0; j < myArrayList.length; j++) {

                if(index==intindex){
                    for (int i = 0; i < lengthElement; i++) {
                        objects[intindex++]=elements.getIndex(i);
                        size++;
                    }
                    objects[intindex++]=myArrayList[j];
                }else{
                    objects[intindex++]=myArrayList[j];
                }
            }
            myArrayList=objects;
            return true;
        }
    }

    public boolean contains(E e){
        for (Object o : myArrayList) {
            if(o == e){
                return true;
            }
        }
        return false;
    }

    public  boolean cotainsAll(MyArrayList<E> elments){
        int containsTrue = 0;
        for (int i = 0; i < elments.getSize(); i++) {
            for (int j = 0; j < myArrayList.length; j++) {
                if(elments.getIndex(i)==myArrayList[j]){
                    containsTrue++;
                }
            }
        }
        return containsTrue== elments.getSize();
    }
    public void clear(){
        size=0;
        for (int i = 0; i < myArrayList.length; i++) {
            myArrayList[i]=null;
        }
    }
    public  int  indexOf(E e){
        for (int i = 0; i < myArrayList.length; i++) {
            if(myArrayList[i]==e){
                return i;
            }
        }
        return -1;
    }
    E get(int index){
        for (int i = 0; i < myArrayList.length; i++) {
            if(index == i){
                return (E) myArrayList[i];
            }
        }
        return null;
    }

    public  boolean  remove(E e) {
        if (contains(e)){
            Object[] newObj = new Object[myArrayList.length - 1];
            int index = 0;
            for (int i = 0; i < myArrayList.length; i++) {
                if (myArrayList[i] == e) {
                    continue;
                } else {
                    newObj[index++] = myArrayList[i];
                }
            }
            myArrayList = newObj;
            size--;
            return true;
        } else {
            return false;
        }
    }

   /* public boolean removeAll(E[] elements){
        if(cotainsAll(elements)){
            Object[] newObj = new Object[myArrayList.length - elements.length];
            int index=0;
            for (int i = 0; i < myArrayList.length; i++) {
                if (myArrayList[i] == elements[index++]) {
                    continue;
                } else {
                    newObj[index++] = myArrayList[i];
                }
            }
            myArrayList = newObj;
            size--;
        }else {
            return false;
        }
        return true;
    }*/


private E getMyArraylist(){
    Object[] newMyArraylist= new Object[size];
    for (int i = 0; i < size; i++) {
        newMyArraylist[i]=myArrayList[i];
    }
    return (E) newMyArraylist;
}
    E set(int index, E element) {
        if (indexOf(element) !=(-1) && index<=size+1) {
            if(myArrayList[index] == null){
                size++;
                myArrayList[index] = element;
                return (E) myArrayList;
            }
            myArrayList[index] = element;
            return (E) myArrayList;
        }
        return null;
    }

    /*public void sort(Comparator<? super >){

    }*/
    @Override
    public String toString() {
        return "MyArrayList{" +
                "myArrayList=" + Arrays.toString((Object[]) getMyArraylist()) +
                '}';
    }
}
