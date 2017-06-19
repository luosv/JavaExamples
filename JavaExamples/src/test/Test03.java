package test;

/**
 * 测试题03
 * Created by luosv on 2017/6/19 0019.
 */
public class Test03 {

    public static void main(String[] args) {

        int x = 10;
        double y = 20.2;
        long z = 10L;
        String str = "" + x + y * z;
        //y * z先计算再加入字符串拼接
        System.out.println("str: " + str);

    }

}
