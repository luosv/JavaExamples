package java.thread;

/**
 * 线程优先级设置
 * Created by luosv on 2016/11/7 0007.
 */
public class ThreadSetPriority extends Thread {

    private int countDown = 5;
    private volatile double d = 0;

    private ThreadSetPriority(int priority) {

        setPriority(priority);
        start();

    }

    public String toString() {

        return super.toString() + ": " + countDown;

    }

    public void run() {

        while (true) {
            for (int i = 0; i < 100000; i++) {
                d = d + (Math.PI + Math.E) / (double) i;
                System.out.println(this);
                if (--countDown == 0) {
                    return;
                }
            }
        }

    }

    public static void main(String[] args) {

        new ThreadSetPriority(Thread.MAX_PRIORITY);
        for (int i = 0; i < 5; i++) {
            new ThreadSetPriority(Thread.MIN_PRIORITY);
        }

    }

}
