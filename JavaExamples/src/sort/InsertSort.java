package sort;

import java.util.Arrays;

/**
 * 插入排序
 * Created by luosv on 2017/1/19 0019.
 * 这也是一种简单直观的排序算法，它的工作原理如下：构建有序序列，即对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * 插入排序是稳定的排序算法，时间复杂度是O(n^2)。
 */
public class InsertSort {

    public static void main(String[] args) {

        int[] num = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        System.out.println("排序前：" + Arrays.toString(num));
        insertSort(num);
        System.out.println("排序后：" + Arrays.toString(num));

    }

    private static void insertSort(int[] num) {

        int temp, length = num.length;
        for (int i = 1; i < length; i++) {
            temp = num[i];
            int j = i;
            for (; j >= 1 && temp < num[j - 1]; j--) {
                num[j] = num[j - 1];
            }
            num[j] = temp;
        }

    }

}
