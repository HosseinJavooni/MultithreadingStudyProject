package Tim_Buchalka_Lessons;

import static java.lang.Thread.sleep;

public class AnotherThread extends Thread{
    @Override
    public void run(){
        System.out.println("before Another thread sleep!");
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Some Thread interrupted me (anotherThread)!");
            return;
        }
        System.out.println("after Another thread sleep!");
    }
}
