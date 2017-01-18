package javaList;

import java.util.Arrays;

/**
 * 数组填充
 * Created by luosv on 2016/10/17 0017.
 */
public class ListFill {

    public static void main(String[] args) {

        int array[] = new int[6];

        Arrays.fill(array, 100);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println();

        Arrays.fill(array, 3, 6, 50);
        for (int anArray : array) {
            System.out.println(anArray);
        }

    }

}
