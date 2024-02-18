package Lesson_27.Pattern_FactoryMethod.Task_Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentCreator studentCreator = new StudentCreator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.next();
        System.out.println("Please enter your course");
        int course = scanner.nextInt();

        Student student = studentCreator.createStudentWrapper(course,name);
        System.out.println(student.getLessonPlane());
        System.out.println(student.getName());
    }
}
