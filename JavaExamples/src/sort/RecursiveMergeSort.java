package sort;

import java.util.Arrays;

/**
 * 归并排序(递归版)
 * Created by luosv on 2017/1/19 0019.
 * 归并排序是建立在归并操作上的一种有效的排序算法。该算法是采用分治法的一个非常典型的应用。它的原理如下：
 * 先申请一个空间用于存储排序后的序列，大小为两个已经排序的序列大小之和。在两个已经排序的序列头部分别放置指针，比较指针所指元素的大小，
 * 较小的(或较大的)复制到刚刚申请的新序列空间，该指针后移，重复比较、复制到新序列尾部、后移指针，直到遍历完其中一个序列，则另一个序列的剩余元素全部原序复制到新序列尾部。
 * 归并排序是稳定的排序算法，时间复杂度为O(nlogn)，需要O(n)额外空间。
 */
public class RecursiveMergeSort {

    public static void main(String[] args) {

        int[] num = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        System.out.println("排序前：" + Arrays.toString(num));
        recursiveMergeSort(num, 0, 9);
        System.out.println("排序后：" + Arrays.toString(num));

    }

    private static void merge(int[] num, int head, int median, int tail) {

        int[] num1 = new int[median - head + 1];
        int[] num2 = new int[tail - median];
        int length1 = num1.length, length2 = num2.length;
        System.arraycopy(num, head, num1, 0, length1);
        System.arraycopy(num, median + 1, num2, 0, length2);
        int i = 0, j = 0, k = head;
        while (i < length1 && j < length2) {
            num[k++] = (num1[i] < num2[j]) ? num1[i++] : num2[j++];
        }
        while (i < length1) {
            num[k++] = num1[i++];
        }
        while (j < length2) {
            num[k++] = num2[j++];
        }

    }

    private static void recursiveMergeSort(int[] num, int head, int tail) {

        int median = (head + tail) / 2;
        if (median != tail) {
            recursiveMergeSort(num, head, median);
            recursiveMergeSort(num, median + 1, tail);
        }
        merge(num, head, median, tail);

    }

}
