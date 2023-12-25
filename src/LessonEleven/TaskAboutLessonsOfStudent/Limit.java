package LessonEleven.TaskAboutLessonsOfStudent;

public abstract class Limit {
    int limitTime;

    public Limit(int LimitTime) {
        this.limitTime = limitTime;
    }

    public int getLimitTime() {
        return limitTime;
    }

    public void setLimitTime(int limitTime) {
        this.limitTime = limitTime;
    }
}
