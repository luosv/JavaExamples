package javaList;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 数组并集
 * Created by Administrator on 2016/10/17 0017.
 */
public class ListAndSet {

    public static void main(String[] args) {

        String[] arr1 = {"1", "2", "3"};
        String[] arr2 = {"4", "5", "6"};
        String[] result_union = union(arr1, arr2);
        System.out.println("并集的结果如下：");

        for (String str : result_union) {
            System.out.println(str);
        }

    }

    // 求两个字符串数组的并集，利用set的元素唯一性
    private static String[] union(String[] arr1, String[] arr2) {
        Set<String> set = new HashSet<String>();

        for (String str : arr1) {
            set.add(str);
        }

        /*
        for (String str : arr2) {
            set.add(str);
        }
        */

        Collections.addAll(set, arr2); // IDEA提示，此方法比foreach更简洁

        String[] result = {};

        return set.toArray(result);
    }

}
