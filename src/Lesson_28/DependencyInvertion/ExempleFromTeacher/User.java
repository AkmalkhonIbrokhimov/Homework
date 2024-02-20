package Lesson_28.DependencyInvertion.ExempleFromTeacher;

public class User {
    private Logger logger;

    public User(Logger logger) {
        this.logger = logger;
    }
    public void doSometihing(){
        logger.log("SomeThing  happened in user case");
    }

}
