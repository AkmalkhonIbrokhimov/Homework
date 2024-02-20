package Lesson_28.DependencyInvertion.ExempleFromTeacher;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Loggin to fule: "+message);
    }
}
