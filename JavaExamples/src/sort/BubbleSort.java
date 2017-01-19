package sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * Created by luosv on 2017/1/19 0019.
 * 冒泡排序，是一种简单的排序算法。因其排序过程中较大(或小)元素会慢慢“浮到”顶部，就像鱼吐泡泡而得名。它的工作原理如下：
 * 重复地遍历要排序的序列，一次比较两个元素，如果它们的顺序错误就把它们交换过来，直到序列有序。
 * 冒泡排序是稳定的排序算法，时间复杂度为O(n^2)。
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] num = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        System.out.println("排序前：" + Arrays.toString(num));
        bubbleSort(num);
        System.out.println("排序后：" + Arrays.toString(num));

    }

    private static void bubbleSort(int[] num) {

        int length = num.length;
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > i; j--) {
                if (num[j - 1] > num[j]) {
                    int temp = num[j - 1];
                    num[j - 1] = num[j];
                    num[j] = temp;
                }
            }
        }

    }

}
