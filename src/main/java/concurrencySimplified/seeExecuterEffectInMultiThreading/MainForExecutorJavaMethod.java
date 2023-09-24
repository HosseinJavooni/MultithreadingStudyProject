package concurrencySimplified.seeExecuterEffectInMultiThreading;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainForExecutorJavaMethod {
    public static void main(String[] args) throws IOException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/concurrencySimplified/seeExecuterEffectInMultiThreading/result.txt");
        StringBuffer sharedString = new StringBuffer();
        executor.execute(new ThreadGenerator("A", fileOutputStream, sharedString));
        executor.execute(new ThreadGenerator("B", fileOutputStream, sharedString));
        executor.execute(new ThreadGenerator("C", fileOutputStream, sharedString));
        executor.execute(new ThreadGenerator("D", fileOutputStream, sharedString));
        executor.execute(new ThreadGenerator("E", fileOutputStream, sharedString));
        executor.execute(new ThreadGenerator("F", fileOutputStream, sharedString));
        executor.execute(new ThreadGenerator("G", fileOutputStream, sharedString));
        executor.execute(new ThreadGenerator("H", fileOutputStream, sharedString));
        executor.execute(new ThreadGenerator("I", fileOutputStream, sharedString));
        executor.execute(new ThreadGenerator("J", fileOutputStream, sharedString));
        executor.shutdown();
    }
}
