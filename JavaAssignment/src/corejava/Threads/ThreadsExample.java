package corejava.Threads;

public class ThreadsExample {
    public static void main(String[] args) throws Exception {
        //int ages[] = {2,3,5,6,7,9,10,12,15,18};
        System.out.println("Thread Name is    " + Thread.currentThread().getName());
       // for (int age : ages) {
        //    Thread.sleep(1000 );
         //   System.out.println(age + "   Threads Name   " + Thread.currentThread().getName());
       // }
        long startTime = System.currentTimeMillis();
        HorseRunnerRunable horseRunner = new HorseRunnerRunable();
       // horseRunner.start();//horseRunner.run();
        Thread thread1 = new Thread(horseRunner, "lomesh");
        thread1.start();

        HorseRunnerRunable horseRunner2 = new HorseRunnerRunable();
        //horseRunner2.start();
        Thread thread2 = new Thread(horseRunner, "priyam");
        thread2.start();

        long endTime = System.currentTimeMillis();

        System.out.println("The total time is " + (endTime - startTime)/1000 +"sec");

       // callMe();
        System.out.println("I am done With the Program..... "+ Thread.currentThread().getName());
    }

   // public static void callMe(){
       // System.out.println("Thread Name is    " + Thread.currentThread().getName());

    }

