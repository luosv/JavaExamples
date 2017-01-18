package javaList;

import java.util.ArrayList;

/**
 * 数组差集
 * Created by luosv on 2016/10/17 0017.
 */
public class ListDifferenceSet {

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

        objArray1.removeAll(objArray2);
        System.out.println("array1与array2的数组差集为： " + objArray1);

        //objArray2.removeAll(objArray1);
        //System.out.println("array2与array1的数组差集为： " + objArray2);

    }

}
