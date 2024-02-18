package Lesson_27.Pattern_FactoryMethod.Task_Student;

public class SecondCourseStudent extends Student {
    public SecondCourseStudent(String name) {
        super(name);
    }

    @Override
    String getLessonPlane() {
        return "You have got 12 lessons this week!";
    }
}
