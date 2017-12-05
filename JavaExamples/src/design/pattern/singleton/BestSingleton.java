package design.pattern.singleton;

/**
 * 教程是多久没更新了？jdk1.5引入枚举后，如下是单例模式的最佳实现方式！
 * 更简洁，自动支持序列化机制，绝对防止多次实例化
 * Created by luosv on 2017/12/5 0005.
 */
public class BestSingleton {
    /**
     * 用枚举来实现单例
     */
    private enum Singleton {

        INSTANCE;
        BestSingleton processor;

        Singleton() {
            this.processor = new BestSingleton();
        }

        BestSingleton getProcessor() {
            return processor;
        }

    }

    public static BestSingleton getInstance() {
        return Singleton.INSTANCE.getProcessor();
    }

    public void showMsg() {
        System.out.println("用枚举来实现单例！");
    }
}
