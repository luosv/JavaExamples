package javaDataStructure;

/**
 * 数字求和运算
 * Created by LuoSw on 2016/10/24 0024.
 */
public class DigitalSum {

    public static void main(String[] args) {

        int limit = 1000;
        int sum = 0;
        int i = 1;

        do {
            sum = sum + i;
            i++;
        } while (i <= limit);
        System.out.println("sum = " + sum);

    }

}
