package expert.os.examples;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class VirtualThreadTest {

    @Test
    public void shouldHelloWorld() throws InterruptedException {
        Thread thread = Thread
                .startVirtualThread(() -> System.out.println("Hello World"));
        thread.join();
    }


    @Test
    public void shouldGetVirtualThreadName() throws InterruptedException {
        Thread.Builder builder = Thread.ofVirtual().name("Virtual Thread");
        Runnable task = () -> System.out.println("Hello World");
        Thread thread = builder.start(task);
        System.out.println(thread.getName());
        thread.join();
    }

    @Test
    public void shouldCreateMultipleInstances() throws InterruptedException {
        Thread.Builder builder = Thread.ofVirtual().name("Virtual Thread", 0);
        Runnable task = () -> System.out.println("Hello World: " + Thread.currentThread().threadId());

        Thread thread1 = builder.start(task);
        Thread thread2 = builder.start(task);
        thread1.join();
        thread2.join();
    }

    @Test
    public void shouldUseExecutorService()throws Exception{
        try(ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()){
            Future<String> future = executor.submit(() -> "Hello World");
            System.out.println(future.get());
            System.out.println("The end!");
        }
    }
}
