package javaException;

/**
 * 链试异常
 * Created by LuoSw on 2016/10/24 0024.
 */
public class ExceptionDemo08 {

    public static void main(String[] args) throws Exception {

        int n = 20, result = 0;

        try {

            result = n / 0;
            System.out.println("结果为 " + result);

        } catch (ArithmeticException e) {

            System.out.println("发生算数异常 " + e);

            try {

                throw new NumberFormatException();

            } catch (NumberFormatException ex) {

                System.out.println("手动抛出链试异常 " + ex);

            }

        }

    }

}
