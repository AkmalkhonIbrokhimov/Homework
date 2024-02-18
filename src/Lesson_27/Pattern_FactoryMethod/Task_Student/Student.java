package Lesson_27.Pattern_FactoryMethod.Task_Student;

public abstract class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    abstract String getLessonPlane();
}
