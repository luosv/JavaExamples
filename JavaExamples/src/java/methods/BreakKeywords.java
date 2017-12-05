package java.methods;

/**
 * break关键字用法
 * Created by luosv on 2016/10/18 0018.
 */
public class BreakKeywords {

    public static void main(String[] args) {

        int[] array = {99, 12, 22, 34, 45, 67, 5678, 8990};
        int no = 5678;
        int i = 0;
        boolean found = false;

        for (; i < array.length; i++) {
            if (no == array[i]) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(no + " 元素的索引位置在： " + i);
        } else {
            System.out.println(no + " 元素不在数组中");
        }

    }

}
