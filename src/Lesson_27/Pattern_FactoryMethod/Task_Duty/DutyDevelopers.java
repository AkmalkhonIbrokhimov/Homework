package Lesson_27.Pattern_FactoryMethod.Task_Duty;

public class DutyDevelopers implements Duty {
    @Override
    public void onDuty() {
        System.out.println("The developers are on duty today");
    }
}
