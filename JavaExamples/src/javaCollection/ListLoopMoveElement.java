package javaCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * List 循环移动元素
 * Created by luosv on 2016/11/3 0003.
 */
public class ListLoopMoveElement {

    public static void main(String[] args) {

        List list = Arrays.asList("one Two three Four five six".split(" ")); // 此处空格只能为一个
        System.out.println("List: " + list);
        Collections.rotate(list, 3);
        System.out.println("rotate: " + list);

    }

}
