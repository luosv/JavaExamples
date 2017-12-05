package java.methods;

/**
 * continue关键字用法
 * Created by luosv on 2016/10/18 0018.
 */
public class ContinueKeywords {

    public static void main(String[] args) {

        StringBuffer searchStr = new StringBuffer("hello hao are you.");
        int length = searchStr.length();
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (searchStr.charAt(i) != 'h') {
                continue;
            }
            count++;
            searchStr.setCharAt(i, 'h');
        }

        System.out.println("发现 " + count + " 个 h 字符");
        System.out.println(searchStr);

    }

}
