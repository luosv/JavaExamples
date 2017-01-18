package javaDataStructure;

import java.util.LinkedList;

/**
 * 删除链表中的元素
 * Created by luosv on 2016/10/25 0025.
 */
public class DeleteLinkedListElement {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("1");
        linkedList.add("8");
        linkedList.add("6");
        linkedList.add("4");
        linkedList.add("5");
        System.out.println(linkedList);

        linkedList.subList(2, 4).clear();
        System.out.println(linkedList);

    }

}
