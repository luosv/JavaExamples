package javaMethods;

/**
 * Varargs 可变参数使用
 * Created by luosv on 2016/10/18 0018.
 */
public class Varargs {

    private static int sumVarargs(int... intArrays) {

        int sum, i;
        sum = 0;
        for (i = 0; i < intArrays.length; i++) {
            sum += intArrays[i];
        }
        return sum;

    }

    public static void main(String[] args) {

        int sum;
        sum = sumVarargs(10, 12, 33, 55);
        System.out.println("数字相加之和为： " + sum);

    }

}
