package Lesson_33_Thread_Lifecycle;

public class MyThreadOne extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(MyThreadOne.currentThread().getName()+" - "+i);
            try {
                sleep(300);
            } catch (InterruptedException e) {

            }
        }
    }
}
