package Thread.Reppit;

public class main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(new Mythread(counter),"threadONE");
        Thread thread2 = new Thread(new Mythread(counter),"threadTWo");
        thread1.start();
        thread2.start();

    }

}
