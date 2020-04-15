package completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example1_sample {
    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        try {
            String result = completableFuture.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        completableFuture.complete("Result of Future");
    }
}
