package javaList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 数组反转
 * Created by luosv on 2016/10/14 0014.
 */
public class ListReversal {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");
        System.out.println("反转前：" + arrayList);
        Collections.reverse(arrayList);
        System.out.println("反转后：" + arrayList);

    }

}
