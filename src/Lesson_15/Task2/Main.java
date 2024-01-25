package Lesson_15.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Animal animal = Animal.valueOf(s.toUpperCase());
        animal.showInfo();


    }
}
