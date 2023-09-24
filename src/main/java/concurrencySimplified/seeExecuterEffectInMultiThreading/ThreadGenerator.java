package concurrencySimplified.seeExecuterEffectInMultiThreading;

import java.io.FileOutputStream;
import java.io.IOException;

public class ThreadGenerator implements Runnable{
    private String threadIndicator;
    public StringBuffer sharedString;

    FileOutputStream outputStream;
    public ThreadGenerator(String threadIndicator, FileOutputStream outputStream, StringBuffer sharedString){
        this.threadIndicator = threadIndicator;
        this.outputStream = outputStream;
        this.sharedString = sharedString;

    }

    @Override
    public void run(){
        for (int i=0; i < 1000; i++) {
            System.out.print(threadIndicator);
            sharedString.append(threadIndicator);
            checkTheStartOrEndOfAThread(i);
        }
    }
    private void checkTheStartOrEndOfAThread(int i) {
        if (i == 0) {
            try{
                outputStream.write(("Thread name : " + Thread.currentThread().getName() +" --> Start index of " + threadIndicator + " is " + (sharedString.length() - 1) + "\n").getBytes());
            } catch (IOException e){
                e.printStackTrace();
            }
        } else if (i == 999){
            try{
                outputStream.write(("Thread name : " + Thread.currentThread().getName() +" --> End   index of " + threadIndicator + " is " + (sharedString.length() - 1) + "\n").getBytes());
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
