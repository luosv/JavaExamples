package javaString;

/**
 * 删除字符串中的一个字符
 * Created by luosv on 2016/10/12 0012.
 */
public class RemoveCharAt {

    public static void main(String[] args) {

        String str = "this is Java";
        System.out.println(removeCharAt(str, 3));

    }

    public static String removeCharAt(String s, int pos) {

        // substring()截取字符串
        System.out.println(s.substring(5));
        System.out.println(s.substring(5, 7)); // 注意空格也算在内

        return s.substring(0, pos) + s.substring(pos + 1);

    }

}
