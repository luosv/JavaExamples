package javaThread;

/**
 * 获取所有线程
 * Created by luosv on 16/11/18.
 */
public class GetAllThread extends Thread {

    public static void main(String[] args) {

        GetAllThread t1 = new GetAllThread();
        t1.setName("thread1");
        t1.start();

        ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
        int noThreads = currentGroup.activeCount();
        Thread[] lstThreads = new Thread[noThreads];
        currentGroup.enumerate(lstThreads);

        for (int i = 0; i < noThreads; i++) {
            System.out.println("线程号：" + i + " = " + lstThreads[i].getName());
        }

    }

}
