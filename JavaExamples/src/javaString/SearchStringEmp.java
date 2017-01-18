package javaString;

/**
 * 字符串查找
 * Created by luosv on 2016/10/13 0013.
 */
public class SearchStringEmp {

    public static void main(String[] args) {

        String strOrig = "Hello Readers";

        int intIndex = strOrig.indexOf("Hello");

        if (intIndex == -1) {
            System.out.println("Hello not found");
        } else {
            System.out.println("Found Hello at index: " + intIndex);
        }

    }

}
