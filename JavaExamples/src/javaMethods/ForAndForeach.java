package javaMethods;

/**
 * for和foreach循环使用
 * Created by LuoSw on 2016/10/18 0018.
 */
public class ForAndForeach {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};

        forDispaly(array);
        foreachDispaly(array);

    }

    private static void forDispaly(int[] a) {

        System.out.println("使用 for 循环数组");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }

    private static void foreachDispaly(int[] data) {

        System.out.println("使用 foreach 循环数组");
        for (int a : data) {
            System.out.print(a + " ");
        }

    }

}
