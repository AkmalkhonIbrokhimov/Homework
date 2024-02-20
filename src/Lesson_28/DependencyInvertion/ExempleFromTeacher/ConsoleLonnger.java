package Lesson_28.DependencyInvertion.ExempleFromTeacher;

public class ConsoleLonnger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Loggin to console: "+ message);
    }
}
