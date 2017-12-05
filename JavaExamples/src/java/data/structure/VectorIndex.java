package java.data.structure;

import java.util.Collections;
import java.util.Vector;

/**
 * 获取向量元素的索引值
 * Created by luosv on 2016/10/25 0025.
 */
public class VectorIndex {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        vector.add("X");
        vector.add("M");
        vector.add("D");
        vector.add("A");
        vector.add("O");

        Collections.sort(vector);
        System.out.println(vector);

        int index = Collections.binarySearch(vector, "D");
        System.out.println(index);

    }

}
