package Lesson_18.Task_2_;

import java.util.LinkedList;


public class Grouup {

    FootballClub footballClub ;
    TennisClub tennisClub;
    private Students students;
    private Message message = null;
    LinkedList<Students> group = new LinkedList<>();


    public void addStudent(Students students){
            group.add(students);
            setMessage(message.showInfo("Talaba qushildi"));
    }
    public void addStudents( LinkedList<Students> students){
        for (Students student : students) {
            group.add(student);
        }
       // setMessage(message.showInfo(" Talabalar gruhga qoshildi"));

    }
    public void getSizeGroup(){
       // setMessage(message.showInfo("Gruhdagi talabalar soni: "));
        System.out.println(group.size());
    }

    public LinkedList getgroupOfFootballer() {
        LinkedList<Students> groupOfFootballer = new LinkedList<>();
        for (Students student : group) {
            if ( student.getClub_1() == "Footballer" || student.getClub_2() == "Footballer") {
                groupOfFootballer.add(student);
            }
        }
        return groupOfFootballer;
    }

  /*  @Override
    public LinkedList getgroupOfFootballer() {
        LinkedList<Students> groupOfFootballer = new LinkedList<>();
        for (Students student : group) {
            if (((student.getClub_1().equals("Footballer") && student.getClub_1() != null) || (student.getClub_2().equals("Footballer") && student.getClub_2() != null))) {
                groupOfFootballer.add(student);
            }
        }return groupOfFootballer;
    }*/
    public void getFootballer(){

        setMessage(message.showInfo("Faqatgina Futbol togaragiga qatnashadigan oquvchilar royhati:"));
        System.out.println(footballClub.getgroupOfFootballer(group) );

    }



    public void setMessage(Message message) {
            this.message = message;
        }

    public Students getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Grouup{" +
                " group=" + group +
                '}';
    }
}
