package Lesson_28_29.OpenClose.Example_for_OC_Developer;

public class DataScientistDeveloper implements Developer{
    @Override
    public void showInfo() {
        System.out.println("I know Python, SQL, Java, Julia ,Scala,C/C++ and JavaScript languages");
    }

    @Override
    public void experience() {
        System.out.println("I have two years of experience");
    }
}
