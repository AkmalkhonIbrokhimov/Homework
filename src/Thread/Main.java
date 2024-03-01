package Thread;

public class Main {
    public static void main(String[] args) {
//        For for1 = new For("for1");
//        For for2 = new For("for2");
//        Thread thread1 = new Thread(for1);
//        Thread thread2 = new Thread(for2);
//            thread1.start();
//            thread2.start();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("my thread "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread.start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("my thread "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();









    }
}
