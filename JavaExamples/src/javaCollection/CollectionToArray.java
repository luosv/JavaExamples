package javaCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合转数组
 * Created by LuoSw on 2016/11/3 0003.
 */
public class CollectionToArray {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("雨");
        list.add("墨");
        list.add(" www.yumoon.cn");

        String[] strings = list.toArray(new String[0]);

        /*// for
        for (int i = 0; i < strings.length; i++) {
            String contents = strings[i];
            System.out.print(contents);
        }*/

        // foreach better!!!
        for (String contents : strings) {
            System.out.print(contents);
        }

    }

}
