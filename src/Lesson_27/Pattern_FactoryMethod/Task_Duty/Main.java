package Lesson_27.Pattern_FactoryMethod.Task_Duty;

import Lesson_27.Pattern_FactoryMethod.TAsk_Developper.Developer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a day of week");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.next();
        DutyCreator dutyCreator = new DutyCreator();
        Duty duty = dutyCreator.createDuty(day);
        duty.onDuty();
    }

}
