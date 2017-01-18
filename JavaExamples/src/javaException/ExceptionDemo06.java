package javaException;

/**
 * 获取异常的堆栈信息
 * Created by luosv on 2016/10/24 0024.
 */
public class ExceptionDemo06 {

    public static void main(String[] args) {

        int array[] = {20, 20, 40};
        int num1 = 15, num2 = 10;
        int result = 10;

        try {

            result = num1 / num2;
            System.out.println("结果为 " + result);
            for (int i = 5; i >= 0; i--) {
                System.out.println("The value of array is" + array[i]);
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
