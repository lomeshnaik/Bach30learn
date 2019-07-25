package corejava.Threads.sync;

public class SyncExample {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread thread1 = new Thread(printer, "john");
        //thread1.setPriority(Thread.MAX_PRIORITY);

        Thread thread2 = new Thread(printer, "sam");
        Thread thread3 = new Thread(printer, "dan");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
