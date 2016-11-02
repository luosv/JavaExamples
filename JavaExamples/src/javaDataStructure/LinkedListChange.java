package javaDataStructure;

import java.util.LinkedList;

/**
 * 链表修改
 * Created by LuoSw on 2016/10/26 0026.
 */
public class LinkedListChange {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("B");
        linkedList.add("B");
        linkedList.add("T");
        linkedList.add("H");
        linkedList.add("P");

        System.out.println(linkedList);

        linkedList.set(2, "M");
        System.out.println(linkedList);

    }

}
