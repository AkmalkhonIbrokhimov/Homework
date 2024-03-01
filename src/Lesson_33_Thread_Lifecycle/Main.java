package Lesson_33_Thread_Lifecycle;

import static java.lang.Thread.getDefaultUncaughtExceptionHandler;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args)  {
        //race condetion -
        //threadlar ikkiga booldbad 1)UserThread 2)Deemon\
        // boglanish usularri 3 ta One to one,oneTo many
        //thrad  schendlen
        //max priority - 10 min -1;
        //Dounded
        // deamon kilsak main sreadk=ga qaram hisoblanadi.
        //kontecst sveching.
       MyThreadOne myThreadOne = new MyThreadOne();
       // myThreadOne.setPriority(5);
        myThreadOne.setDaemon(true);
        myThreadOne.start();
        //myThreadOne.setUncaughtExceptionHandler();

        /*for (int i = 0; i < 10; i++) {
            try {
                System.out.println(Thread.currentThread().getName()+"-"+i);
                Thread.sleep(500);
                if(i==5){
                    throw  new RuntimeException("error");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }*/
        MyThreadTwo myThreadTwo = new MyThreadTwo();
//        myThreadTwo.setUncaughtExceptionHandler(new CustmExceptionhandler());
      //  myThreadTwo.setUncaughtExceptionHandler((Thread thread, Throwable throwable) -> {
        //    System.out.println(thread.getName()+"->"+throwable.getMessage());
        //});

        myThreadTwo.start();



    }
}
