package Lesson_27.Pattern_FactoryMethod.Task_Student;

public class FirstCourseStudent extends Student {
    public FirstCourseStudent(String name) {
        super(name);
    }

    @Override
    String getLessonPlane() {
        return "You have got 16 lessons this week!";
    }
}
