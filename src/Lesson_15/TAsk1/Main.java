package Lesson_15.TAsk1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MonthVsSeason[] monthVsSeasons = MonthVsSeason.values();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Oy raqamini kiriting");
        int number = scanner.nextInt();
        number=number-1;
        System.out.println(monthVsSeasons[number]);

        String s = String.valueOf(monthVsSeasons[number]);
        System.out.println(s);
        MonthVsSeason monthVsSeason = MonthVsSeason.valueOf(s);
        monthVsSeason.showInfo();

    }
}
