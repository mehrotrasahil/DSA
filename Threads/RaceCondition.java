package Threads;

class Increment {
    int count = 0;

    public void counter() {
        count++;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Increment increment = new Increment();

        Runnable task = () -> {
            for (int i = 0; i <= 10000; i++) {
                increment.counter();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        // t1.join();
        // t2.join();

        System.out.println("Final Count: " + increment.count);

    }
}
