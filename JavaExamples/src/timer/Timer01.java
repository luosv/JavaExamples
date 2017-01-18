package timer;

/**
 * 创建一个 thread，然后让它在 while 循环里一直运行着，通过 sleep 方法来达到定时任务的效果
 * Created by luosv on 2017/1/17 0017.
 */
public class Timer01 {

    public static void main(String[] args) {

        final long timeInterval = 1000;

        Runnable runnable = () -> {
            while (true) {
                // code run task
                System.out.println("请等待...");
                try {
                    Thread.sleep(timeInterval);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

    }

}
