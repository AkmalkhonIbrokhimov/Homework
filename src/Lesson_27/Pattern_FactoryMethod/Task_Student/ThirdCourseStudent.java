package Lesson_27.Pattern_FactoryMethod.Task_Student;

public class ThirdCourseStudent extends Student {
    public ThirdCourseStudent(String name) {
        super(name);
    }

    @Override
    String getLessonPlane() {
        return "You have got 8 lessons this week!";
    }
}
