package java.list;

import java.util.Arrays;

/**
 * 判断数组是否相等
 * Created by luosv on 2016/10/17 0017.
 */
public class ListEquals {

    public static void main(String[] args) throws Exception {

        int[] ary = {1, 2, 3, 4, 5, 6};
        int[] ary1 = {1, 2, 3, 4, 5, 6};
        int[] ary2 = {1, 2, 3, 4};

        System.out.println("数组ary是否与ary1相等？ ：" + Arrays.equals(ary, ary1));
        System.out.println("数组ary是否与ary2相等？ ：" + Arrays.equals(ary, ary2));

    }

}
