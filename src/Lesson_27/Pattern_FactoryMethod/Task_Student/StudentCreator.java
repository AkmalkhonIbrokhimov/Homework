package Lesson_27.Pattern_FactoryMethod.Task_Student;

public class StudentCreator extends StudentFactory{
    @Override
    Student createStudent(int courseNumber, String name) {
        return switch (courseNumber){
            case 1 ->  new FirstCourseStudent(name);
            case 2 ->  new SecondCourseStudent(name);
            case 3 ->  new ThirdCourseStudent(name);
            default -> throw new RuntimeException(courseNumber+"is unknow course");
        };
    }
}
