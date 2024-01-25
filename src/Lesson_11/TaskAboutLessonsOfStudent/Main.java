package Lesson_11.TaskAboutLessonsOfStudent;

public class Main {
    public static void main(String[] args) {

        Lesson lesson = new  Lesson("MobilPro",6);
        Lesson lesson1 = new  Lesson("Kotlin",3);
        Student student1 = new Student("Akmalxon",22,12);
        System.out.println(student1.addLesson(lesson));
        System.out.println(student1.addLesson(lesson1));
        student1.getLesson();




    }
}
