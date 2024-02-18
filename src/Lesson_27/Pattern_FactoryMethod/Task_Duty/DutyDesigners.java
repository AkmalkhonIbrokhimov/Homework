package Lesson_27.Pattern_FactoryMethod.Task_Duty;

public class DutyDesigners implements Duty {
    @Override
    public void onDuty() {
        System.out.println("The Designers are on duty today");
    }
}
