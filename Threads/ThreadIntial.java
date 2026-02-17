package Threads;

class ChildThread implements Runnable {
    public void run() {
        /* Without sleep method */
        // for (char c = 'A'; c <= 'E'; c++) {
        // System.out.println("Child Thread: " + c);

        // }

        /* With sleep method */
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Child Thread: " + c);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadIntial {
    public static void main(String[] args) {

        ChildThread childThread = new ChildThread();
        Thread t = new Thread(childThread);
        t.start();

        for (int i = 0; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }

    }

}
