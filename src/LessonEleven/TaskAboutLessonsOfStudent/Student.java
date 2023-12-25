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

        if(limitTime>=lesson.getTimeOFWeek()){
            Lesson[] newLesson = new Lesson[lessons.length+1];
            int index=0;
            for (int i = 0; i < lessons.length; i++) {
                newLesson[index]=lessons[i];
            }
            newLesson[index]=lesson;
            setLimitTime(limitTime-lesson.getTimeOFWeek());

            return true;
        }else{
            System.out.println(" You do not have enough time becose you don't add new lesson. You need " + (lesson.getTimeOFWeek()-limitTime)+" free time");
        }
        return false;
    }
    public void sshowInfo(){
        System.out.println("Student name "+name);
        System.out.println("The student is " +age+ " years old" );
        for (Lesson lesson:lessons) {
            System.out.println("He's enrolled in"+lesson);
        }
        System.out.println("he has free time  "+limitTime+" hour on a weekly");

    }

    boolean  isFullLesson(Lesson lesson){
        return limitTime==0;
    }
    void getLesson(){
        int lessonNumber=0;
        for (Lesson lesson: lessons ) {
            lessonNumber++;
            System.out.println( lessonNumber+ "."+lesson.getLessonName());
        }
    }

}
