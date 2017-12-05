package java.string;

/**
 * 字符串比较
 * Created by luosv on 2016/10/12 0012.
 */
public class StringCompareEmp {

    public static void main(String[] args) {

        String str = "Hello World";
        String anotherString = "hello world";
        Object object = str;

        // compare函数比较，返回字符串中第一个字母ASCII的差值
        System.out.println(str.compareTo(anotherString));
        System.out.println(str.compareToIgnoreCase(anotherString)); // 忽略大小写
        System.out.println(str.compareTo(object.toString()));

        // == 和 equals
        System.out.println(str == anotherString);
        System.out.println("Hello World".equals(str));
        System.out.println(str == object);
        System.out.println(str.equals(anotherString));
        System.out.println(str.equals(object.toString()));

    }

}
