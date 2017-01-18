package javaCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 查找 List 中的最大最小值
 * Created by luosv on 2016/11/3 0003.
 */
public class ListMaxAndMin {

    public static void main(String[] args) {

        List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println(list);
        System.out.println("最大值: " + Collections.max(list));
        System.out.println("最小值: " + Collections.min(list));

    }

}
