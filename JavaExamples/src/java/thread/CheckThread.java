package java.thread;

/**
 * 查看线程是否存活
 * Created by luosv on 2016/11/7 0007.
 */
public class CheckThread extends Thread {

    public void run() {

        for (int i = 0; i < 10; i++) {
            printMsg();
        }

    }

    private void printMsg() {

        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name: " + name);

    }

    public static void main(String[] args) {

        CheckThread ct = new CheckThread();
        ct.setName("Thread");
        System.out.println("before start(), ct.isAlive() = " + ct.isAlive());
        ct.start();
        System.out.println("just after start(), ct.isAlive() = " + ct.isAlive());
        for (int i = 0; i < 10; i++) {
            ct.printMsg();
        }
        System.out.println("the end of main(), ct.isAlive() = " + ct.isAlive());

    }

}
