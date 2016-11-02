package javaException;

/**
 * 多线程异常处理
 * Created by LuoSw on 2016/10/24 0024.
 */
class MyThread extends Thread {

    public void run() {

        System.out.println("Throwing in " + "MyThread");
        throw new RuntimeException();

    }

}

public class ExceptionDemo05 {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();

        try {

            Thread.sleep(1000);

        } catch (Exception e) {

            System.out.println("Caught it " + e);

        }

        System.out.println("Exiting main");

    }

}
