package javaList;

import java.util.ArrayList;

/**
 * 数组交集
 * Created by Administrator on 2016/10/17 0017.
 */
public class ListIntersection {

    public static void main(String[] args) {

        ArrayList objArray1 = new ArrayList();
        ArrayList objArray2 = new ArrayList();

        objArray1.add(0, "common1");
        objArray1.add(1, "common2");
        objArray1.add(2, "notcommon2");
        objArray2.add(0, "common1");
        objArray2.add(1, "common2");
        objArray2.add(2, "notcommon");
        objArray2.add(3, "notcommon1");

        System.out.println("array1的元素： " + objArray1);
        System.out.println("array2的元素： " + objArray2);

        objArray1.retainAll(objArray2);
        System.out.println("array2 & array1 数组交集为：" + objArray1);

        objArray2.retainAll(objArray1);
        System.out.println("array1 & array2 数组交集为：" + objArray2);

    }

}
