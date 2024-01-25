package Lesson_16.Task5_Students;

public class Main {
    public static void main(String[] args) {
        University university = new University("TATU","Axborot Texnalo, Тоshkent, Toshkent");
        University.Student student = university. new Student("Rahimjanov","Azizbek",1);
        student.showInfo();
    }
}
