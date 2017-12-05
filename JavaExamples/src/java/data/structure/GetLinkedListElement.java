package java.data.structure;

import java.util.LinkedList;

/**
 * 获取链表（LinkedList）的第一个和最后一个元素
 * Created by luosv on 2016/10/25 0025.
 */
public class GetLinkedListElement {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.add("100");
        linkedList.add("200");
        linkedList.add("300");
        linkedList.add("400");
        linkedList.add("500");

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

    }

}
