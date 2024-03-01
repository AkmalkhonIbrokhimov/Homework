package Lesson_18.Task_2_;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Message message = new Message() {
            @Override
            public void showInfo(String message) {

            }
        };

        Students student = new Students("Akmalxon","Ibroximov",22,"Footballer");
        LinkedList<Students> students = new LinkedList<>();
        students.add(new Students("Mardon","Jumonov",23));
        students.add(new Students("Ilxomjon","Ergashev",23,"Footballer"));
        students.add(new Students("Dostonjon","Maxmudov",22,"Tennisit"));
        students.add(new Students("Rasulxon","Olimjonov",22,"Tennisit"));
        students.add(new Students("Xusniddin","Baxriddinow",22,"Footballer","Tennisit"));
        Grouup grouup = new Grouup();



                grouup.addStudent(student);
        System.out.println(grouup);
        System.out.println("________________________________________________________________________________________");
        System.out.println('\n');
        grouup.addStudents(students);
        System.out.println(grouup);
        System.out.println("________________________________________________________________________________________");
        System.out.println('\n');
        System.out.println("Gruhdagi o'quvchilar soni :");
        grouup.getSizeGroup();
        System.out.println("________________________________________________________________________________________");
        System.out.println('\n');
        System.out.println("Faqat fudbolga qatnashadigan o'qivchilar royhati: ");
        System.out.println(grouup.getgroupOfFootballer());



    }
}