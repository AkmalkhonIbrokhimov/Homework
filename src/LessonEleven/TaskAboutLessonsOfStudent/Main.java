package LessonEleven.TaskAboutLessonsOfStudent;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Akmalxon",22,12);
        Lesson lesson = new  Lesson("MobilPro",6);
        student.addLesson(lesson);
        student.sshowInfo();


    }
}
