package list.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList线程安全测试
 * Created by luosv on 2017/5/19 0019.
 */
public class ArrayListInThread implements Runnable {

    private List<String> list = new ArrayList<>(); //thread not safe

//    // 无锁不安全
//    @Override
//    public void run() {
//        try {
//            Thread.sleep((int) (Math.random() * 2));
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        list.add(Thread.currentThread().getName());
//    }

    // 有锁安全
    @Override
    public synchronized void run() {
        try {
            Thread.sleep((int) (Math.random() * 2));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list.add(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("testGroup");
        ArrayListInThread at = new ArrayListInThread();
        for (int i = 0; i < 10000; i++) {
            Thread th = new Thread(group, at, String.valueOf(i));
            th.start();
        }
        while (group.activeCount() > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("list长度为： " + at.list.size());
    }

}
/*
ArrayList的add()方法执行过程如下：
public boolean add(E e) {
    ensureCapacity(size + 1);  // Increments modCount!!
    elementData[size++] = e;
    return true;
}
分为两个步骤：
（1）将add的元素放到size位置
（2）将size加1
线程不安全在于：size++是线程不安全的。假设size=5.若线程A在5位置存放了值valueA，获得size=5,但还没来得及将size加1写入主存。
此时线程B在也在5位置存放了值valueB,也获得size=5，而后A、B分别将size加1后写入主存，size=6，即两个线程执行两次add()后size只加了1
以上，由于size++是线程不安全的，10000个线程对list执行了10000次add()，而size却小于10000.
将其变为线程安全的方法：List<String> list = Collections.synchronizedList(new ArrayList<String>())
但此方法会极大的影响性能
 */