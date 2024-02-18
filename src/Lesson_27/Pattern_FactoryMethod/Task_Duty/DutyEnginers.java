package Lesson_27.Pattern_FactoryMethod.Task_Duty;

public class DutyEnginers implements Duty {
    @Override
    public void onDuty() {
        System.out.println("The Enginers are on duty today");
    }
}
