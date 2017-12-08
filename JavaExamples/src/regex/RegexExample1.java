package regex;

import java.util.regex.Pattern;

/**
 * Created by luosv on 2017/12/8 0008.
 */
public class RegexExample1 {
    public static void main(String[] args) {
        String content = "I am luo " + "from chengdu.com";

        String pattern = ".*chengdu.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'chengdu' 子字符串? " + isMatch);
    }
}
