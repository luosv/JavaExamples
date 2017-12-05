package java.data.structure;

import java.util.LinkedList;

/**
 * 链表元素查找
 * Created by luosv on 2016/10/25 0025.
 */
public class LinkedListElementSearch {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");
        linkedList.add("2");

        System.out.println(linkedList.indexOf("2"));
        System.out.println(linkedList.lastIndexOf("2"));

    }

}
