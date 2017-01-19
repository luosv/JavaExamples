package sort;

import java.util.Arrays;

/**
 * 快速排序(递归版)
 * Created by luosv on 2017/1/19 0019.
 * 快速排序是由东尼·霍尔所发展的一种排序算法。在平均状况下，排序 n 个项目要Ο(nlogn)次比较。在最坏状况下则需要Ο(n^2)次比较，
 * 但这种状况并不常见。事实上，快速排序通常明显比其他Ο(nlogn) 算法更快，因为它的内部循环（inner loop）可以在大部分的架构上很有效率地被实现出来，
 * 且在大部分真实世界的数据，可以决定设计的选择，减少所需时间的二次方项之可能性。
 * 快速排序是不稳定的排序算法，时间复杂度是O(nlogn)～O(n^2)，平均时间O(n^2)。
 */
public class RecursiveQuickSort {

    public static void main(String[] args) {

        int[] num = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        System.out.println("排序前：" + Arrays.toString(num));
        recursiveQuickSort(num, 0, 9);
        System.out.println("排序后：" + Arrays.toString(num));

    }

    private static void recursiveQuickSort(int[] num, int head, int tail) {

        int i = head, j = tail;
        int pivot = num[head];
        while (i < j) {
            while (i < j) {
                if (pivot >= num[j]) {
                    num[i++] = num[j];
                    break;
                }
                j--;
            }
            while (i < j) {
                if (pivot <= num[i]) {
                    num[j--] = num[i];
                    break;
                }
                i++;
            }
        }
        num[i] = pivot;
        if (i - 1 - head > 0) {
            recursiveQuickSort(num, head, i - 1);
        }
        if (tail - i - 1 > 0) {
            recursiveQuickSort(num, i + 1, tail);
        }

    }

}
