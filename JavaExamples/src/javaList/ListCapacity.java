package javaList;

import java.util.Arrays;

/**
 * 数组扩容
 * Created by Administrator on 2016/10/17 0017.
 */
public class ListCapacity {

    public static void main(String[] args) {

        String[] names = new String[] {"A", "B", "C"};
        String[] extended = new String[5];

        extended[3] = "D";
        extended[4] = "E";

        System.arraycopy(names, 0, extended, 0, names.length);

        for (String str : extended) {
            System.out.println(str);
        }
        System.out.println(Arrays.toString(extended));

        // 理解arraycopy参数
        int[] a = {1, 2, 3};
        int[] b = new int[10];
        b[4] = 4;
        b[5] = 5;
        System.arraycopy(a, 1, b, 2, 2);
        System.out.println(Arrays.toString(b));
        System.arraycopy(a, 0, b, 6, 1);
        System.out.println(Arrays.toString(b));

    }

}
