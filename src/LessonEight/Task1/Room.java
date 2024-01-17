package LessonEight.Task1;

public class Room {
    private Student student;
    private int sizeRoom;

    private int freePlace = 0;



   public Room(int sizeRoom,Student student){
       this.sizeRoom = sizeRoom;
       this.student = student;
   }
   public boolean add(Student student){
       String[] studendtsInRoom = new String[sizeRoom];

       if(studendtsInRoom.length!=0) {
           studendtsInRoom[freePlace] = student.getName();
           freePlace++;
           for (int i = 0; i < freePlace; i++) {
               student.setName(studendtsInRoom[i]);
               showInfo(student);
           }


           return true;
       }else {
           return false;
       }
   }
   public boolean isFull() {
       return freePlace == sizeRoom;
   }
   public boolean isEmpty() {
           return (freePlace != sizeRoom);
       }
       public void showInfo(Student student){
           System.out.println(student.getName());
           System.out.println(student.getAge());

   }
}
