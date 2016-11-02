package javaMethods;

import java.util.Arrays;

/**
 * 输出数组元素
 * Created by LuoSw on 2016/10/17 0017.
 */
public class PrintArray {

    private static void printArray(Integer[] inputArray) {

        for (Integer element : inputArray) {
            System.out.printf("%s ", element);
            System.out.println();
        }
        System.out.println(Arrays.toString(inputArray));

    }

    private static void printArray(Double[] inputArray) {

        for (Double element : inputArray) {
            System.out.printf("%s ", element);
            System.out.println();
        }
        System.out.println(Arrays.toString(inputArray));

    }

    private static void printArray(Character[] inputArray) {

        for (Character element : inputArray) {
            System.out.printf("%s ", element);
            System.out.println();
        }
        System.out.println(Arrays.toString(inputArray));

    }

    public static void main(String[] args) {

        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("输出整型数组：");
        printArray(integerArray);

        System.out.println("\n输出双精度型数组：");
        printArray(doubleArray);

        System.out.println("\n输出字符型数组：");
        printArray(characterArray);

    }

}
