package java.thread.dieLock;

import java.util.Date;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * 死锁及解决方法
 * Created by luosv on 2016/11/7 0007.
 * <p>
 * 不使用显示的去锁，用信号量去控制。
 * 信号量可以控制资源能被多少线程访问，这里指定只能被一个线程访问，做到类似锁住。信号量可以指定去获取的超时时间，根据这个超时时间，去做一个额外处理。
 * 对于无法成功获取的情况，一般就是重复尝试，或指定尝试的次数，也可以马上退出。
 * 如下代码：
 */
public class UnLockTest {

    static final String obj1 = "obj1";
    static final Semaphore a1 = new Semaphore(1);
    static final String obj2 = "obj2";
    static final Semaphore a2 = new Semaphore(2);

    public static void main(String[] args) {

        LockA la = new LockA();
        new Thread(la).start();

        LockB lb = new LockB();
        new Thread(lb).start();

    }

}

class LockAa implements Runnable {

    @Override
    public void run() {

        try {
            System.out.println(new Date().toString() + " LockA 开始执行");
            while (true) {
                if (UnLockTest.a1.tryAcquire(1, TimeUnit.SECONDS)) {
                    System.out.println(new Date().toString() + " LockA 锁住 obj1");
                    if (UnLockTest.a2.tryAcquire(1, TimeUnit.SECONDS)) {
                        System.out.println(new Date().toString() + " LockA 锁住 obj2");
                        Thread.sleep(60 * 1000); // do something
                    } else {
                        System.out.println(new Date().toString() + " LockA 锁 obj2 失败");
                    }
                } else {
                    System.out.println(new Date().toString() + " LockA 锁 obj1 失败");
                }
                UnLockTest.a1.release(); // 释放
                UnLockTest.a2.release();
                Thread.sleep(1000); // 马上进行尝试，显示情况do something是不确定的
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

class LockBb implements Runnable {

    @Override
    public void run() {

        try {
            System.out.println(new Date().toString() + " LockB 开始执行");
            while (true) {
                if (UnLockTest.a2.tryAcquire(1, TimeUnit.SECONDS)) {
                    System.out.println(new Date().toString() + " LockB 锁住 obj2");
                    if (UnLockTest.a1.tryAcquire(1, TimeUnit.SECONDS)) {
                        System.out.println(new Date().toString() + " LockB 锁住 obj1");
                        Thread.sleep(60 * 1000); // do something
                    } else {
                        System.out.println(new Date().toString() + " LockB 锁 obj1 失败");
                    }
                } else {
                    System.out.println(new Date().toString() + " LockB 锁 obj2 失败");
                }
                UnLockTest.a1.release(); // 释放
                UnLockTest.a2.release();
                Thread.sleep(10 * 1000); // 这里只是为了演示，所以tryAcquire只用1秒，而且B要给A让出能执行的时间，否则两个永远是死锁
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
