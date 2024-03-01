package Thread.Reppit;

public class Mythread implements Runnable{
    private Counter counter;

    public Mythread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.counter();
            System.out.println(Thread.currentThread().getName()+" " +i+ " "+counter.getCount());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

