package Lesson_27.Pattern_FactoryMethod.Task_Student;

public abstract class StudentFactory {
    abstract Student createStudent(int courseNumber,String name);
    Student createStudentWrapper(int courseNumber,String name){
        return createStudent(courseNumber,name);
    }
}
