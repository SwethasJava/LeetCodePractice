package Practice;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockinQueueExample {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Inside main method");

        BlockingQueue queue = new ArrayBlockingQueue<>(3);

        Runnable producer = () -> {
            String[] items = {"pizza", "burger", "cake"};

            for (String item : items) {
                try {
                    queue.put(item);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            try {
                queue.put("done"); //signal end
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };


        Runnable consumer = () -> {
            String item;
            while (true) {
                try {
                    if ((item = (String) queue.take()).equals("done")) break;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } // blocks if queue is empty
                System.out.println("Consumer: Serving " + item);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        };
    }
}
