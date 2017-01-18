package javaList;

import java.util.Arrays;

/**
 * 数组排序及元素查找
 * Created by luosv on 2016/10/13 0013.
 */
public class ListSortSearchElement {

    public static void main(String[] args) throws Exception {

        int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        Arrays.sort(array);
        printArray("数组排序结果为", array);
        int index = Arrays.binarySearch(array, 2);
        System.out.println("元素 2 在第 " + index + " 位置");

    }

    private static void printArray(String message, int array[]) {

        System.out.print(message + ": [length:" + array.length + "] ");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(",");
            }
            System.out.print(array[i]);
        }
        System.out.println();

    }

}
