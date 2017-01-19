package sort;

import java.util.Arrays;

/**
 * 选择排序
 * Created by luosv on 2017/1/18 0018.
 * 这是一种最简单直观的排序算法，它的工作原理如下：
 * 每一趟从待排序的数列中选出最小的（最大的）一个元素，顺序放到已经排好序的数列的最后，直到所有待排元素全部排好。
 * 选择排序是稳定的排序算法，时间复杂度是O(n^2)。
 */
public class SelectSort {

    public static void main(String[] args) {

        int[] num = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        System.out.println("排序前：" + Arrays.toString(num));
        selectSort(num);
        System.out.println("排序后：" + Arrays.toString(num));

    }

    private static void selectSort(int[] num) {

        int min, temp, length = num.length;
        for (int i = 0; i < length; i++) {
            min = i;
            for (int j = i + 1; j < length; j++) {
                if (num[min] > num[j]) {
                    min = j;
                }
            }
            temp = num[i];
            num[i] = num[min];
            num[min] = temp;
        }

    }

}