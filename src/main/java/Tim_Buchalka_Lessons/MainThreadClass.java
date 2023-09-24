package Tim_Buchalka_Lessons;

import static java.lang.Thread.sleep;

public class MainThreadClass {
    public static void main(String[] args) throws InterruptedException {
        System.out.println( "Main Thread is hear!");
        var anotherThread = new AnotherThread();
        anotherThread.start();
//        sleep(1000);
        System.out.println("Hello again from manin thread");
        var anotherThreadSubClass = new AnotherThreadSubClass();
        anotherThreadSubClass.start();
        new Thread() {
            @Override
            public void run(){
                System.out.println("1-Anonymous Inner class 1");
                System.out.println("2-Anonymous Inner class 1");
                System.out.println("3-Anonymous Inner class 1");
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("4-Anonymous Inner class 1");
                System.out.println("5-Anonymous Inner class 1");
                System.out.println("6-Anonymous Inner class 1");
            }
        }.start();
        anotherThread.interrupt();
        new Thread(){
            @Override
            public void run() {
                System.out.println("Anonymous Inner class 2");
            }
        }.start();
        Thread threadFromRunnable = new Thread(() ->
        {
            System.out.println("Lambda in thread!");
//                try {
//                    anotherThread.join();
//                } catch (InterruptedException e){
//                    e.printStackTrace();
//                }
        });
        threadFromRunnable.start();
    }
}
