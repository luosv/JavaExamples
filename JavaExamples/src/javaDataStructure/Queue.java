package javaDataStructure;

import java.util.LinkedList;

/**
 * 队列（Queue）用法
 * Created by LuoSw on 2016/10/25 0025.
 */
public class Queue {

    public static void main(String[] args) {
        // add()和remove()方法在失败的时候会抛出异常(不推荐)
        java.util.Queue<String> queue = new LinkedList<String>();
        // 添加元素
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for (String q : queue) {
            System.out.println(q);
        }
        System.out.println("---------------");
        System.out.println("poll = " + queue.poll()); // 返回第一个元素，并在队列中删除
        for (String q : queue) {
            System.out.println(q);
        }
        System.out.println("---------------");
        System.out.println("element = " + queue.element()); // 返回第一个元素
        for (String q : queue) {
            System.out.println(q);
        }
        System.out.println("---------------");
        System.out.println("peek = " + queue.peek()); // 返回第一个元素
        for (String q : queue) {
            System.out.println(q);
        }
    }

}
