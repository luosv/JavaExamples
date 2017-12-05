package java.string;

/**
 * 查找字符串最后一次出现的位置
 * Created by luosv on 2016/10/12 0012.
 */
public class SearchLastString {

    public static void main(String[] args) {

        String strOrig = "Hello World, Hello Reader";

        int lastIndex = strOrig.lastIndexOf("Hello");

        if (lastIndex == -1) {
            System.out.println("Hello not found");
        } else {
            System.out.println("Last occurrence of Hello is at index: " + lastIndex);
        }

    }

}
