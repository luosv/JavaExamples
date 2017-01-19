package sort;

import java.util.Arrays;

/**
 * 希尔排序
 * Created by luosv on 2017/1/19 0019.
 * 希尔排序，也称递减增量排序算法，是插入排序的一种高速而稳定的改进版本。我把希尔排序叫做分组插入排序，它的工作原理如下：
 * 先把要排序的序列元素以序列长度的1/2为间隔(向下取整)两两分为一组，对每组分别进行插入排序，排完后再以序列长度的1/4为间隔(向下取整)分组，
 * 对每组分别进行插入排序，重复上述操作，直至间隔为一，即最后一趟为普通的插入排序(此时序列已基本有序)。
 * 希尔排序是不稳定的排序算法，时间复杂度取决于分组间隔gap的取值，在O(n(lgn)^2)～O(n^2)之间，目前最佳版本O(n(lgn)^2)。
 */
public class ShellSort {

    public static void main(String[] args) {

        int[] num = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        System.out.println("排序前：" + Arrays.toString(num));
        shellSort(num);
        System.out.println("排序后：" + Arrays.toString(num));

    }

    private static void shellSort(int[] num) {

        int temp, length = num.length;
        for (int gap = length / 2; gap > 0; gap /= 2) {
            for (int i = 0; i < gap; i++) {
                for (int j = i + gap; j < length; j += gap) {
                    temp = num[j];
                    int k = j;
                    for (; k >= gap && temp < num[k - gap]; k -= gap) {
                        num[k] = num[k - gap];
                    }
                    num[k] = temp;
                }
            }
        }

    }

}
