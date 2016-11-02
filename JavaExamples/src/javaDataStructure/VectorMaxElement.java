package javaDataStructure;

import java.util.Collections;
import java.util.Vector;

/**
 * 获取向量的最大元素
 * Created by LuoSw on 2016/10/26 0026.
 */
public class VectorMaxElement {

    public static void main(String[] args) {

        Vector<Double> vector = new Vector<>();

        vector.add(new Double("3.4324"));
        vector.add(new Double("3.3532"));
        vector.add(new Double("3.342"));
        vector.add(new Double("3.349"));
        vector.add(new Double("2.3"));

        Object obj = Collections.max(vector);
        System.out.println(obj);

    }

}
