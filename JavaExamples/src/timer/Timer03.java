package timer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 用 ScheduledExecutorService 是从的 java.util.concurrent 里做为并发工具类被引进的，这是最理想的定时任务实现方式
 * ·相比于 Timer 的单线程，它是通过线程池的方式来执行任务的
 * ·可以很灵活的去设定第一次执行任务 delay 时间
 * ·提供了良好的约定，以便设定执行的时间间隔
 * Created by luosv on 2017/1/17 0017.
 */
public class Timer03 {

    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("请等待...");

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);

    }

}
