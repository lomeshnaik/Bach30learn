package corejava.Threads.communication;

public class WaitNotify {
    public static void main(String[] args) {
        calculatorThread calculatorThread = new calculatorThread();
        calculatorThread.start();

        synchronized (calculatorThread) {
            System.out.println("main Thread a waiting....");
            try {
                calculatorThread.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println("Child Thread is completed.. ");

        System.out.println("Total value" + calculatorThread.getTotalValue());
    }
}
class calculatorThread extends Thread {

    int totalValue;

    public void run() {
        synchronized (this) {
            for (int i = 0; i <= 5; i++) {
                totalValue = totalValue + i;
                System.out.println("calculating....");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            notify();
                /**/
            }

        }
        public int getTotalValue () {
            return totalValue;
        }

    }