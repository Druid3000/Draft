package completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "test")
                .thenApply(str -> str + "1");

        CompletableFuture.supplyAsync(() -> "test")
                .thenApply(str -> str + "1")
                .thenAccept(System.out::println);

        String result = completableFuture.get();
    }
}
