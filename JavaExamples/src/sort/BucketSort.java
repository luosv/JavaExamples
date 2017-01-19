package sort;

import java.util.Arrays;

/**
 * 桶排序
 * Created by luosv on 2017/1/19 0019.
 * 桶排序的思想特别简单，就是找出所给序列中最大的元素，新建一个大小为最大元素加一的序列并初始化为全0，
 * 所给序列中元素的大小与新建的序列的下标相对应，遍历所给序列，每遇到一个元素，以这个元素为下标的新序列的元素就自加1。
 * 桶排序是稳定的排序算法，时间复杂度为O(n)，需要O(k)额外空间。
 */
public class BucketSort {

    public static void main(String[] args) {

        int[] num = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        System.out.println("排序前：" + Arrays.toString(num));
        bucketSort(num);
        System.out.println("排序后：" + Arrays.toString(num));

    }

    private static int maxElemOfNum(int[] num) {
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i] + 1;
            }
        }
        return max;
    }

    private static void bucketSort(int[] num) {
        int length = num.length, max = maxElemOfNum(num), i, j;
        int[] bucket = new int[max];
        for (i = 0; i < length; i++) {
            bucket[num[i]]++;
        }
        for (i = 0, j = 0; i < max; i++) {
            while ((bucket[i]--) > 0) {
                num[j++] = i;
            }
        }
    }

}
