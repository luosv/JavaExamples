package javaException;

/**
 * 重载方法异常处理
 * Created by luosv on 2016/10/24 0024.
 */
public class ExceptionDemo07 {

    double method(int i) throws Exception {
        return i / 0;
    }

    boolean method(boolean b) {
        return !b;
    }

    static double method(int x, double y) throws Exception {
        return x + y;
    }

    static double method(double x, double y) {
        return x + y - 3;
    }

    public static void main(String[] args) {

        ExceptionDemo07 ex = new ExceptionDemo07();

        try {
            System.out.println(method(10, 20.0));
            System.out.println(method(10.0, 20));
            System.out.println(method(10.0, 20.0));
            System.out.println(ex.method(10));
        } catch (Exception e) {

            System.out.println("exception occur: " + e);

        }

    }

}
