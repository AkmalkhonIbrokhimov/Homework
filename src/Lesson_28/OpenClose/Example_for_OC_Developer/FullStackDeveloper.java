package Lesson_28.OpenClose.Example_for_OC_Developer;

public class FullStackDeveloper implements Developer{
    @Override
    public void showInfo() {
        System.out.println("I know Java,Node. js, Python, C#. ASP.NET, PHP and JavaScript languages");
    }
    @Override
    public void experience() {
        System.out.println("I have ten years of experience");
    }
}
