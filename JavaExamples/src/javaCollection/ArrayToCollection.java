package javaCollection;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转集合
 * Created by luosv on 2016/10/26 0026.
 */
public class ArrayToCollection {

    public static void main(String[] args) throws IOException {

        int n = 5; // 5个元素

        String[] name = new String[n];

        for (int i = 0; i < n; i++) {
            name[i] = String.valueOf(i);
        }

        List<String> list = Arrays.asList(name);

        System.out.println();

        for (String s : list) {
            System.out.print(s + "  ");
        }

    }

}
