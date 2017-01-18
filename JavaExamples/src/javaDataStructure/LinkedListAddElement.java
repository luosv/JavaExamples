package javaDataStructure;

import java.util.LinkedList;

/**
 * 在链表（LinkedList）的开头和结尾添加元素
 * Created by luosv on 2016/10/25 0025.
 */
public class LinkedListAddElement {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");
        System.out.println(linkedList);

        linkedList.addFirst("0");
        System.out.println(linkedList);

        linkedList.addLast("6");
        System.out.println(linkedList);

    }

}
