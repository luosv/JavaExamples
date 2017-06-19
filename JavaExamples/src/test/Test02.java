package test;

/**
 * 测试题02
 * Created by luosv on 2017/6/19 0019.
 */
public class Test02 {

    public static void main(String[] args) {

        boolean flag = 10 % 2 == 1 && 10 / 3 == 0 && 1 / 0 == 0;
        // 有一个false就全false（10除2取余为0）
        System.out.println(flag ? "aliyunedu" : "yootk");

    }

}
