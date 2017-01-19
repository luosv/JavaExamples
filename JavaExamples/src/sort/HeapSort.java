package sort;

import java.util.Arrays;

/**
 * 堆排序
 * Created by luosv on 2017/1/19 0019.
 * 堆排序，与归并排序相似，不同的是堆排序的时间复杂度为O(nlogn)。又与插入排序相似，不同的是堆排序是不稳定的排序算法且具有空间原址性：
 * 任何时候都只需要常数个额外的元素空间存储临时数据。因此，堆排序是集合了归并排序和插入排序优点的一种排序算法。
 */
public class HeapSort {

    public static void main(String[] args) {

        int[] num = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        System.out.println("排序前：" + Arrays.toString(num));
        heapSort(num);
        System.out.println("排序后：" + Arrays.toString(num));

    }

    private static void maxHeapDown(int[] num, int head, int tail) {

        int p = head, l = 2 * p + 1, r = l + 1;
        int tmp = num[p];
        for (; l <= tail; p = l, l = 2 * l + 1, r = l + 1) {
            if (l < tail && num[l] < num[r]) {
                l = r;
            }
            if (tmp >= num[l]) {
                break;
            } else {
                num[p] = num[l];
                num[l] = tmp;
            }
        }

    }

    private static void heapSort(int[] num) {

        int i, tmp, length = num.length;
        for (i = length / 2 - 1; i >= 0; i--) {
            maxHeapDown(num, i, length - 1);
        }
        for (i = length - 1; i > 0; i--) {
            tmp = num[0];
            num[0] = num[i];
            num[i] = tmp;
            maxHeapDown(num, 0, i - 1);
        }

    }

}
