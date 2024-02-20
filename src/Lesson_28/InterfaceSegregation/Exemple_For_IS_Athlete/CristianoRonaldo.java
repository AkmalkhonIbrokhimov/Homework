package Lesson_28.InterfaceSegregation.Exemple_For_IS_Athlete;

public class CristianoRonaldo implements Footballer{
    @Override
    public void run() {
        System.out.println("This athlete is runnig");
    }

    @Override
    public void kickBall() {
        System.out.println("this athlete is kicking a football");
    }

    @Override
    public void jump() {
        System.out.println("This athlete is jumping");
    }
}
