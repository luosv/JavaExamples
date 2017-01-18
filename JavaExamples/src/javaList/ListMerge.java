package javaList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组合并
 * Created by luosv on 2016/10/17 0017.
 */
public class ListMerge {

    public static void main(String[] args) {

        String a[] = {"A", "E", "I"};
        String b[] = {"O", "U"};

        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));

    }

}
