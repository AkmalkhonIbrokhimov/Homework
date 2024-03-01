package Experement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("Akmal",22));
        arrayList.add(new Person("Akmal",21));
        arrayList.add(new Person("Akmal",221));
        arrayList.add(new Person("Akmal",20));
        arrayList.add(new Person("Akmal",23));
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
