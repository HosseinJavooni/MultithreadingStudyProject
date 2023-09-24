package Tim_Buchalka_Lessons.understandingJoinInThreads;

public class MainClassForJoinConcept {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("thread1 initialized!");
            try{
                Thread.sleep(5000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("end of thread1");
        });
        Thread thread2 = new Thread(() -> {
            System.out.println("thread2 initialized!");
            // if you commented out this try catch you can see the effect of the join of a tread
            try{
                System.out.println("thread2 is waiting for end up of tread1");
                thread1.join(/*2000*/); // join method can get a long value for specific time out of join method call.
               // System.out.println("thread2 can stop just 2000 milliseconds!");
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            // if you commented out this try catch you can see the effect of the join of a tread
            System.out.println("end of thread2");
        });
        Thread thread3 = new Thread(() -> {
            System.out.println("thread3 initialized!");
//            try{
//                thread1.join();
//            } catch (InterruptedException e){
//                e.printStackTrace();
//            }
            System.out.println("end of thread3");
        });
        Thread thread4 = new Thread(() -> {
            System.out.println("thread4 initialized!");
//            try{
//                thread1.join();
//            } catch (InterruptedException e){
//                e.printStackTrace();
//            }
            System.out.println("end of thread4");
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
