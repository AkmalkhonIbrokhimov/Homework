package Thread;

public class NewMain {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("Mythread");
        MyThread myThread1 = new MyThread("Mythread1");
        Thread newMyThread = new Thread(myThread,"hi thread");
        Thread newMyThread1 = new Thread(myThread1);
        newMyThread1.start();
        newMyThread.start();




         new Thread(new Runnable() {
             public void run() {
                 for (int i = 0; i < 5; i++) {
                     System.out.println("runnable"+i);
                     if(i==3){
                         throw new RuntimeException();
                     }
                     try {
                         Thread.sleep(1000);
                     } catch (InterruptedException e) {
                         throw new RuntimeException(e);
                     }
                 }
             }
         }).start();

    }
}
