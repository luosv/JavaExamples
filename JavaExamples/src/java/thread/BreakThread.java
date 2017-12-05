package java.thread;

/**
 * 中断线程
 * Created by luosv on 16/11/18.
 */
public class BreakThread extends Object implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("in run() - 将运行 work2() 方法");
            work2();
            System.out.println("in run() - 从 work2() 方法回来");
        } catch (InterruptedException x) {
            System.out.println("in run() - 中断 work2() 方法");
            return;
        }
        System.out.println("in run() - 休眠后执行");
        System.out.println("in run() - 正常离开");
    }

    public void work() throws InterruptedException {
        while (true) {
            for (int i = 0; i < 100000; i++) {
                int j = i * 2;
            }
            System.out.println("A isInterrupted()=" + Thread.currentThread().isInterrupted());
            if (Thread.interrupted()) {
                System.out.println("B isInterrupted()=" + Thread.currentThread().isInterrupted());
                throw new InterruptedException();
            }
        }
    }

    public void work2() throws InterruptedException {
        while (true) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("C isInterrupted()=" + Thread.currentThread().isInterrupted());
                Thread.sleep(2000);
                System.out.println("D isInterrupted()=" + Thread.currentThread().isInterrupted());
            }
        }
    }

    public static void main(String[] args) {

        BreakThread bt = new BreakThread();
        Thread t = new Thread(bt);
        t.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException x) {
            x.printStackTrace();
        }
        System.out.println("in main() - 中断其他线程");
        t.interrupt();
        System.out.println("in main() - 离开");

    }

}
