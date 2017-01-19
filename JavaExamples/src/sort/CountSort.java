package sort;

import java.util.Arrays;

/**
 * 计数排序
 * Created by luosv on 2017/1/19 0019.
 * 计数排序是对桶排序的一种改进，其基本思想是：
 * 对于给定序列中的元素x，确定小于(大于)x的元素个数。利用这一信息，可以直接把x放到它在输出序列中的位置上。
 * 计数排序是稳定的排序算法，时间复杂度为O(n+k)，需要O(n+k)额外空间。
 */
public class CountSort {

    public static void main(String[] args) {

        int[] num = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        System.out.println("排序前：" + Arrays.toString(num));
        countSort(num);
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

    private static void countSort(int[] num) {

        int length = num.length, max = maxElemOfNum(num), i, j;
        int[] temp = new int[length];
        System.arraycopy(num, 0, temp, 0, length);
        int[] bucket = new int[max];
        for (i = 0; i < length; i++) {
            bucket[temp[i]]++;
        }
        for (i = 1; i < max; i++) {
            bucket[i] += bucket[i - 1];
        }
        for (i = 0; i < length; i++) {
            num[bucket[temp[i]] - 1] = temp[i];
            bucket[temp[i]]--;
        }

    }

}
