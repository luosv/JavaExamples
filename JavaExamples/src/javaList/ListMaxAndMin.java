package javaList;

import java.util.Arrays;
import java.util.Collections;

/**
 * 数组获取最大值和最小值
 * Created by Administrator on 2016/10/14 0014.
 */
public class ListMaxAndMin {

    public static void main(String[] args) {

        Integer[] numbers = {8, 2, 7, 1, 4, 9, 5};

        int min = (int) Collections.min(Arrays.asList(numbers)); // 此处的强制类型转换貌似不需要
        int max = (int) Collections.max(Arrays.asList(numbers));
        //System.out.println(Collections.min(Arrays.asList(numbers)));

        System.out.println("最小值：" + min);
        System.out.println("最大值：" + max);

    }

}
