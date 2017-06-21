package test;

/**
 * 测试题05
 * Created by luosv on 2017/6/20 0020.
 */
public class Test05 {

    public static void main(String[] args) {

        int num = 50;
        num = num++ * 2;
        // 记住前置++是先+1再使用，后置++先使用后自增
        System.out.println(num);

        //另一个例子
        int n = 68;
        char c = (char) n;
        System.out.println(c);

    }

    /**
     * 重写方法的规则：
     * <p>
     * 1、参数列表必须完全与被重写的方法相同，否则不能称其为重写而是重载。
     * <p>
     * 2、返回的类型必须一直与被重写的方法的返回类型相同，否则不能称其为重写而是重载。
     * <p>
     * 3、访问修饰符的限制一定要大于被重写方法的访问修饰符（public>protected>default>private）
     * <p>
     * 4、重写方法一定不能抛出新的检查异常或者比被重写方法申明更加宽泛的检查型异常。例如：
     * <p>
     * 父类的一个方法申明了一个检查异常IOException，在重写这个方法是就不能抛出Exception,只能抛出IOException的子类异常，可以抛出非检查异常。
     * <p>
     * <p>
     * <p>
     * 而重载的规则：
     * <p>
     * 1、必须具有不同的参数列表；
     * <p>
     * 2、可以有不责骂的返回类型，只要参数列表不同就可以了；
     * <p>
     * 3、可以有不同的访问修饰符；
     * <p>
     * 4、可以抛出不同的异常；
     * <p>
     * <p>
     * <p>
     * 重写与重载的区别在于：
     * <p>
     * 重写多态性起作用，对调用被重载过的方法可以大大减少代码的输入量，同一个方法名只要往里面传递不同的参数就可以拥有不同的功能或返回值。
     * <p>
     * 用好重写和重载可以设计一个结构清晰而简洁的类，可以说重写和重载在编写代码过程中的作用非同一般.
     */
    public static int info(int x, double y) {
        return 0;
    }

    public static void info(int x, int y) {

    }

}
