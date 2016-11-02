package javaList;

import java.util.ArrayList;

/**
 * 数组删除元素
 * Created by Administrator on 2016/10/17 0017.
 */
public class ListRemoveElement {

    public static void main(String[] args) {

        ArrayList objArray = new ArrayList();

        objArray.clear();
        objArray.add(0, "第0个元素");
        objArray.add(1, "第1个元素");
        objArray.add(2, "第2个元素");
        System.out.println("数组删除元素前： " + objArray);

        objArray.remove(1);
        objArray.remove("0th element");
        System.out.println("数组删除元素后： " + objArray);

    }

}
