package Lesson_28.SingleResposibility.Example_For_Single_responsibility_SHop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Сashiers {
    private String name;
    private ArrayList<String> cashiers;

    public Сashiers(String name, ArrayList<String> cashiers) {
        this.name = name;
        this.cashiers = cashiers;
    }

    public void setCashier(String cashier) {
        this.cashiers.add(cashier);
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getCashiers() {
        return cashiers;
    }
}
