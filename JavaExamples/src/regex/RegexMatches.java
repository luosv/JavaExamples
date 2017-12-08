package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by luosv on 2017/12/8 0008.
 */
public class RegexMatches {
    public static void main(String[] args) {
        //按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        //创建Pattern对象
        Pattern r = Pattern.compile(pattern);

        //创建Matcher对象
        Matcher m = r.matcher(line);

        if (m.find()) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        } else {
            System.out.println("NO MATCH");
        }
    }
}
