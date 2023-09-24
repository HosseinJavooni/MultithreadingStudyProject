package Tim_Buchalka_Lessons.timbuchalka;

import static Tim_Buchalka_Lessons.timbuchalka.ThreadColor.ANSI_BLUE;

/**
 * Created by timbuchalka on 25/05/2016.
 */
public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from another thread.");
    }
}
