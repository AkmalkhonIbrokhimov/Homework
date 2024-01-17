package LessonFifteen.TAsk1;

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
        MonthVsSeason monthVsSeason = MonthVsSeason.valueOf(s);
        monthVsSeason.showInfo();

    }
}
