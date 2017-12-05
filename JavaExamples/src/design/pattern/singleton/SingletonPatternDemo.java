package design.pattern.singleton;

/**
 * 2、从 singleton 类获取唯一的对象
 * Created by luosv on 2017/12/5 0005.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();

        //显示消息
        object.showMessage();


        //单例模式最佳实现方式：枚举
        BestSingleton.getInstance().showMsg();
    }
}
