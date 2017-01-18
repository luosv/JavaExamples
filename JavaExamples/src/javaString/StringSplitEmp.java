package javaString;

/**
 * 字符串分割
 * Created by luosv on 2016/10/13 0013.
 */
public class StringSplitEmp {

    public static void main(String[] args) {

        String str = "www-yumoon-com";
        String[] temp;
        String delimeter = "-"; // 指定分隔符

        temp = str.split(delimeter); // 分割字符串

        System.out.println("========普通for循环========");
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }


        String str1 = "www.google.com";
        String[] temp1;
        String delimeter1 = "\\."; // 注意此处的转义

        temp1 = str1.split(delimeter1);

        System.out.println("========foreach循环========");
        for (String x : temp1) {
            System.out.println(x);
        }

    }

}
