package Lesson_28.OpenClose.Example_for_OC_Developer;

public class FrontendDeveloper implements Developer{
    @Override
    public void showInfo() {
        System.out.println("I know Java,JavaScript, HTML,CSS, ReactJs, TypeScript, and javaScript. languages");
    }
    @Override
    public void experience() {
        System.out.println("I have three years of experience");
    }
}
