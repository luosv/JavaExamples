package javaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 集合打乱顺序
 * Created by LuoSw on 2016/10/26 0026.
 */
public class CollectionShuffle {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println("打乱前： ");
        System.out.println(list);

        System.out.println();

        for (int i = 0; i < 6; i++) {
            System.out.println("第 " + i + " 次打乱： ");
            Collections.shuffle(list);
            System.out.println(list);
            System.out.println();
        }

    }

}
