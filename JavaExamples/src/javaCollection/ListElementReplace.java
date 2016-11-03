package javaCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * List 元素替换
 * Created by LuoSw on 2016/11/3 0003.
 */
public class ListElementReplace {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println("List :" + list);
        Collections.replaceAll(list, "one", "ten");
        System.out.println("replaceAll: " + list);

    }

}
