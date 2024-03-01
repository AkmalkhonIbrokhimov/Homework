package Lesson_33_Thread_Lifecycle;

public class CustmExceptionhandler implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t.getName()+"->"+e.getMessage());
    }
}
