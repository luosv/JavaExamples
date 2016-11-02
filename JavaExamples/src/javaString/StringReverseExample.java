package javaString;

/**
 * 字符串反转
 * Created by Administrator on 2016/10/13 0013.
 */
public class StringReverseExample {

    public static void main(String[] args) {

        String string = "abcdef";

        String reverse = new StringBuffer(string).reverse().toString();

        System.out.println("\nString before reverse: " + string);
        System.out.println("String after reverse: " + reverse);

    }

}
