package sort;

import java.util.Arrays;

/**
 * 基数排序
 * Created by luosv on 2017/1/19 0019.
 * 基数排序是对计数排序的一种改进，它是这样实现的：将所有待比较数值(正整数)统一为同样的数位长度，数位较短的数前面补零。
 * 然后，从最低位开始，依次进行一次排序(计数排序)。这样从最低位排序一直到最高位排序完成以后，数列就变成一个有序序列。
 * 基数排序是稳定的排序算法，时间复杂度为O(kn)，需要O(n)额外空间。
 */
public class RadixSort {

    public static void main(String[] args) {

        int[] num = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        System.out.println("排序前：" + Arrays.toString(num));
        radixSort(num);
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

    private static void radixSort(int[] num) {
        int exp, length = num.length, max = maxElemOfNum(num), i;
        for (exp = 1; (max - 1) / exp > 0; exp *= 10) {
            int[] temp = new int[length];
            int[] buckets = new int[max];
            for (i = 0; i < length; i++) {
                buckets[(num[i] / exp) % 10]++;
            }
            for (i = 1; i < max; i++) {
                buckets[i] += buckets[i - 1];
            }
            for (i = length - 1; i >= 0; i--) {
                temp[buckets[(num[i] / exp) % 10] - 1] = num[i];
                buckets[(num[i] / exp) % 10]--;
            }
            System.arraycopy(temp, 0, num, 0, length);
        }
    }

}
