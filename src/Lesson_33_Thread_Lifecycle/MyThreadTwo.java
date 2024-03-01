package Lesson_33_Thread_Lifecycle;

public class MyThreadTwo extends  Thread{
    @Override
    public void run() {
      /*  MyThreadOne myThreadOne = new MyThreadOne();
        myThreadOne.setDaemon(true);
        myThreadOne.start();*/
        for (int i = 0; i < 10; i++) {
            System.out.println(MyThreadTwo.currentThread().getName()+" - "+i);
            try {
                sleep(300);
                if(i == 2){
                    interrupt();
                }
            } catch (InterruptedException e) {
                 throw new RuntimeException(e);
            }
        }
    }
}
