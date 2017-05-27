package ListThread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * List线程不安全测试
 * Created by luosv on 2017/5/19 0019.
 */
public class TestThread {

    public static void main(String[] args) {
        // 测试10次
        for (int i = 0; i < 10; i++) {
            test();
        }
    }

    private static void test() {
        // 用来测试的list/对象
        List<Object> list = new ArrayList<>();
        Player player = new Player();
        // 线程数量
        int threadCount = 100;
        // 主线程等待threadCount个子线程执行完毕
        CountDownLatch countDownLatch = new CountDownLatch(threadCount);
        // 启动threadCount个子线程
        for (int i = 0; i < threadCount; i++) {
            //Thread thread = new Thread(new MyThread(list, countDownLatch));
            Thread thread = new Thread(new MyThread(player, countDownLatch));
            thread.start();
        }
        // 主线程等待所有子线程执行完毕再向下执行
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // list的size
//        System.out.println("list size: " + list.size());
//        for (Object li : list) {
//            if (li == null) {
//                System.out.println("list中存在null");
//            }
//        }
        // player buff
        System.out.println("buff size: " + player.getBuffs().size());
        for (Buff buff : player.getBuffs()) {
            if (buff == null) {
                System.out.println("buff中存在null");
            }
        }
        // 删除操作
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Buff> buffs = player.getBuffs();
        synchronized (buffs) {
            Iterator<Buff> it = buffs.iterator();
            while (it.hasNext()) {
                Buff buff = it.next();
                if (buff.getModelId() == 10000) {
                    it.remove();
                }
            }
        }
        System.out.println("删除后buff size: " + player.getBuffs().size());
    }

}

class MyThread implements Runnable {

    private List<Object> list;
    private Player player;
    private CountDownLatch countDownLatch;

    MyThread(List<Object> list, CountDownLatch countDownLatch) {
        this.list = list;
        this.countDownLatch = countDownLatch;
    }

    MyThread(Player player, CountDownLatch countDownLatch) {
        this.player = player;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        // 每个线程向List中添加100个元素
        for (int i = 0; i < 100; i++) {
            //list.add(new Object());
            // 给player对象添加数据
            Buff buff = new Buff(i, i * 1000, i * 100, i * 10);
            List<Buff> buffs = player.getBuffs();
            synchronized (buffs) {
                player.getBuffs().add(buff);
            }
        }
        // 完成一个子线程
        countDownLatch.countDown();
    }

}
