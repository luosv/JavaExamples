package timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 用 Timer 和 TimerTask 创建定时任务
 * ·当启动和去取消任务时可以控制
 * ·第一次执行任务时可以指定你想要的delay时间
 * Created by luosv on 2017/1/17 0017.
 */
public class Timer02 {

    public static void main(String[] args) {

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                // code run task
                System.out.println("请等待...");
            }
        };

        Timer timer = new Timer();
        long delay = 0;
        long period = 1000;
        timer.scheduleAtFixedRate(task, delay, period);

    }

}
