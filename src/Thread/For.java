package Thread;

public class For implements Runnable {
    String name;

    public For(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("nimadir xato");
            }
        }
    }
}



