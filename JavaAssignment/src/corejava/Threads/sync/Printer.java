package corejava.Threads.sync;

public class Printer implements Runnable {
    @Override
    public synchronized void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("printing massage from [" + i + "]" + Thread.currentThread().getName());
        }
    }
}
