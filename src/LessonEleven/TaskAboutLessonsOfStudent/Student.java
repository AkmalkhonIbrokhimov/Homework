package LessonEleven.TaskAboutLessonsOfStudent;

public class Student extends Limit {
    private String name;
    private int age;
    Lesson [] lessons = new Lesson[]{};

    public Student(String name, int age, int limit) {
        super(limit);
        this.name = name;
        this.age = age;
    }

    boolean addLesson(Lesson lesson){
        if(limitTime >= lesson.getTimeOFWeek()){
            Lesson[] newLesson = new Lesson[lessons.length+1];
            int index=0;
            for (int i = 0; i < lessons.length; i++) {
                newLesson[index++]=lessons[i];
            }
            newLesson[index]=lesson;
            lessons=newLesson;
            setLimitTime(limitTime-lesson.getTimeOFWeek());

            return true;
        }else{
            System.out.println(" You do not have enough time because you don't add new lesson. You need " + (lesson.getTimeOFWeek()-limitTime)+" free time");
        }
        return false;
    }
    public void showInfo(){
        System.out.println("Student name "+name);
        System.out.println("The student is " +age+ " years old" );
        System.out.println(lessons);
        for (Lesson les:lessons) {
           int  i=1;
            System.out.println(i+"."+"He has signed up for the mobilepro course - "+les.getLessonName());
            i++;
        }
        System.out.println("he has free time  "+limitTime+" hour on a weekly");

    }

    boolean  isFullLesson(){
        return limitTime==0;
    }
    void getLesson(){

        for (Lesson les: lessons ) {
            int lessonNumber=1;
            System.out.println( lessonNumber+ "." + les.getLessonName());
             lessonNumber++;
        }
    }

}
