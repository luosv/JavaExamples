package javaDataStructure;

import java.util.LinkedList;

/**
 * 获取链表的元素
 * Created by LuoSw on 2016/10/25 0025.
 */
public class ElicitLinkedListElement {

    private LinkedList<Object> linkedList = new LinkedList<>();

    private void push(Object obj) {
        linkedList.addFirst(obj);
    }

    private Object top() {
        return linkedList.getFirst();
    }

    private Object pop() {
        return linkedList.removeFirst();
    }

    public static void main(String[] args) {

        ElicitLinkedListElement stack = new ElicitLinkedListElement();

        for (int i = 30; i < 40; i++) {
            stack.push(i);
        }

        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

}
