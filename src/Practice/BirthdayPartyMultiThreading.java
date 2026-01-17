package Practice;

import static java.lang.Thread.sleep;

public class BirthdayPartyMultiThreading {
    public static void main(String args[])
    {
        System.out.println("Inside the main method");
        Object lock = new Object();

        Runnable kitchenManagementRun = new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("Inside Kitchen  :" + Thread.currentThread().getName());
                    try {
                        cookPizza();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    makeDrinks();
                    lock.notifyAll(); // notify waiting threads
                }
            }

            private void cookPizza() throws InterruptedException {
                sleep(500);
            }
        };

        Thread kitchenManagement = new Thread(kitchenManagementRun);
        Thread decorationManamgementThread = new Thread(()-> {
            System.out.println("Inside decoration ..."+ Thread.currentThread().getName());
            synchronized(lock) {
                try {

                    decorateHome();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    getReady();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                lock.notifyAll();
            }


        });
        kitchenManagement.start();
        decorationManamgementThread.start();



        System.out.println("Assuming main Thread continues");

        System.out.println("Assuming Kitchen and Decoration Thread is done");
        try {
            // Wait for both threads to complete
//            kitchenManagement.join();
  //          decorationManamgementThread.join();
            System.out.println("Wait till all the threads are complete");

            Thread cakeCuttingThread = new Thread(()-> {
                synchronized (lock) {
                    try {
                        lock.wait();
                        cutCake();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }

            });
            cakeCuttingThread.start();
                        System.out.println(" Waiting for bot the threads to complete, now cut the cake");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
private static void countDown()
{
    System.out.println("Count of threads and make it count down");

}
    private static void cutCake() {

        System.out.println(" All the threads done, now cut the cake");
    }

    private static void getReady() throws InterruptedException {
        Thread.sleep(40);
    }

    private static void decorateHome() throws InterruptedException {
       Thread.sleep(50);

    }


    private static void makeDrinks() {
    }

}
