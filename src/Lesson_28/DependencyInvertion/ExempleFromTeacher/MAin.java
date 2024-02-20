package Lesson_28.DependencyInvertion.ExempleFromTeacher;

public class MAin {
    public static void main(String[] args) {
        Logger filelonnger = new FileLogger();
        User user = new User(filelonnger);
            user.doSometihing();

        Logger consoleLonnger = new ConsoleLonnger();
        User user1 = new User(consoleLonnger);
        user1.doSometihing();
    }
}
