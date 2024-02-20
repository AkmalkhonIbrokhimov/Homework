package Lesson_28.InterfaceSegregation.Exemple_For_IS_Athlete;

public class UsainBolt implements Runner{
    @Override
    public void run() {
        System.out.println("This athlete is runnig");
    }

    @Override
    public void jump() {
        System.out.println("this athlete is jumping ");
    }
}
