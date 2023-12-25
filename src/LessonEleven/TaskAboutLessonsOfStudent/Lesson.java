package LessonEleven.TaskAboutLessonsOfStudent;

public  class Lesson{
    private String lessonName;
    private int timeOFWeek;

    public Lesson(String lessonName, int timeOFWeek) {
        this.lessonName = lessonName;
        this.timeOFWeek = timeOFWeek;
    }

    public String getLessonName() {
        return lessonName;
    }

    public int getTimeOFWeek() {
        return timeOFWeek;
    }
}
