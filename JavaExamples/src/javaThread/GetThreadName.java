package javaThread;

/**
 * 获取当前线程名称
 * Created by luosv on 2016/11/7 0007.
 */
public class GetThreadName extends Thread {

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

        GetThreadName gtn = new GetThreadName();
        gtn.start();
        for (int i = 0; i < 10; i++) {
            gtn.printMsg();
        }

    }

}
