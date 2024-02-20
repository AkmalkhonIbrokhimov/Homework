package Lesson_28.OpenClose.Example_for_OC_Developer;

public class MobileDeveloper implements Developer{
    @Override
    public void showInfo() {
        System.out.println("I know Java,Kotlin,Swift,C#,GO,OjectC,C++,Python and JavaScript languages");
    }
    @Override
    public void experience() {
        System.out.println("I have four years of experience");
    }
}
