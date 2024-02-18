package Lesson_27.Pattern_FactoryMethod.Task_Duty;

public class DutyAccounts implements Duty {
    @Override
    public void onDuty() {
        System.out.println("The accaunts are on duty today");
    }
}
