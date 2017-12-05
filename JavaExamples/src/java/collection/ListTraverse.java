package java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List 遍历
 * Created by luosv on 2017/4/20 0020.
 */
public class ListTraverse {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        // 迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // foreach better!
        for (String s : list) {
            System.out.println(s);
        }

        // java8 + lambda
        list.forEach(System.out::println);
        list.forEach(li -> {
            if ("C".equals(li)) {
                System.out.println("find:" + li);
            }
        });

    }

}
