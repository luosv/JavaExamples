package java.reflect;

/**
 * Created by luosv on 2017/8/29 0029.
 */
public class TestClassType {

    //构造函数
    public TestClassType() {
        System.out.println("构造函数");
    }

    //静态的参数初始化
    static {
        System.out.println("静态的参数初始化");
        int i = 100;
        System.out.println("i=" + i);
    }

    //非静态的参数初始化
    {
        System.out.println("非静态的参数初始化");
        int j = 100;
        System.out.println("j=" + j);
    }

}

class HelloWorld {

    public static void main(String... args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class testTypeForName = Class.forName("TestClassType");
        TestClassType t = (TestClassType) testTypeForName.newInstance();
    }

}

/*
类是程序的而一部分，每个类都有一个Class对象。在Java中，所有的类都是在对其第一次使用时，动态加载到JVM中的
当程序创建第一个对类的静态成员的引用时，就会加载这个类。Java程序在它开始运行前并非完全被加载，其各个部分是在必需时才加载
使用Class.forName时这个类被载入内存，静态代码块的代码被执行
使用Class对象创建一个该类的对象时，先初始化非静态的属性和非静态的代码块，之后调用构造器

Class是java反射的核心类
核心方法{

成员属性
getFields()：获得类的public类型的属性
getDeclaredFields()：获得类的所有属性
getField(String name)
getDeclaredField(String name)

成员方法
getMethods()：获得类的public类型的方法
getDeclaredMethods()：获得类的所有方法
getMethod(String name, Class[] parameterTypes)：获得类的特定方法getDeclaredMethod(String name, Class[] parameterTypes)：获得类的特定方法

构造方法
getConstructors()：获得类的public类型的构造方法。
getDeclaredConstructors()：获得类的所有构造方法。
getConstructor(Class[] parameterTypes)：获得类的特定构造方法getDeclaredConstructor(Class[] params)；获得类的特定方法

}
*/