package completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Example2_runAsync {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(new Runnable(){
            @Override
            public void run(){
                try{
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e){
                    throw new IllegalStateException(e);
                }
            }
        });

        completableFuture.get();
    }

}
