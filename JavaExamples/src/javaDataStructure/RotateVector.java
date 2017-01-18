package javaDataStructure;

import java.util.*;

/**
 * 旋转向量
 * Created by luosv on 2016/10/26 0026.
 */
public class RotateVector {

    public static void main(String[] args) {

        Vector<java.io.Serializable> vector = new Vector<>();

        vector.add('1');
        vector.add("2");
        vector.add("3");
        vector.add("4");
        vector.add("5");

        System.out.println(vector);

        Collections.swap(vector, 0, 4);
        System.out.println(vector);

        // 数组
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println(arrayList);

        Collections.swap(arrayList, 0, 2);
        System.out.println(arrayList);

    }

}
