package Lesson_28.OpenClose.Example_for_OC_Developer;

public class DesktopSoftwareDeveloper implements Developer{
    @Override
    public void showInfo() {
        System.out.println("I know Java,C#,C++,Python and JavaScript languages");
    }
    @Override
    public void experience() {
        System.out.println("I have five years of experience");
    }
}
