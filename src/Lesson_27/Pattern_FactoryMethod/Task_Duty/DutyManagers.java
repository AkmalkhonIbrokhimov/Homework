package Lesson_27.Pattern_FactoryMethod.Task_Duty;

public class DutyManagers implements Duty {
    @Override
    public void onDuty() {
        System.out.println("The Managers are on duty today");
    }
}
