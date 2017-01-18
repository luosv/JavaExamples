package timer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 做一个定时器，要求在指定时间后运行,运行指定时间后结束运行
 * Created by luosv on 2017/1/17 0017.
 */
public class TimerTest {

    public static void main(String[] args) {

        timer(10, 10, 1);

    }

    /**
     * 定时器
     * @param delay 等待时间
     * @param duration 运行时间
     * @param period 运行频率
     */
    private static void timer(int delay, int duration, int period) {

        long end = System.currentTimeMillis() + (duration + delay - 1) * 1000;
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable runnable = () -> {
            long now = System.currentTimeMillis();
            System.out.println(now + " : 运行中...");
            if (now >= end) {
                System.out.println(now + " : 结束...");
                service.shutdown();
            }
        };
        service.scheduleAtFixedRate(runnable, delay, period, TimeUnit.SECONDS);

    }

}
