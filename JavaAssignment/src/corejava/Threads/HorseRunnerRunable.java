package corejava.Threads;

public class HorseRunnerRunable implements Runnable {

    public HorseRunnerRunable (){

    }

    public HorseRunnerRunable(String horseRunner){
        //super(horseRunner);
    }

    @Override
    public void run() {
        int ages[] = {2,3,5,6,7,9,10,12,15,18};
        //System.out.println("Thread Name is    " + Thread.currentThread().getName());
        for (int age : ages) {
            try {
                Thread.sleep(1000 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(age + "   Threads Name   " + Thread.currentThread().getName());
        }
    }
}
