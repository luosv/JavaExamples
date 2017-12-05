package java.string;

/**
 * 首字母大写
 * Created by luosv on 2016/11/2 0002.
 */
public class InitialToUpperCase {

    private static String formatProperties(String name) {

        if (name.length() > 1) {
            if (Character.isLowerCase(name.charAt(0))) {
                if (Character.isLowerCase(name.charAt(1))) {
                    return String.valueOf(name.charAt(0)).toUpperCase() + name.substring(1);
                } else {
                    return String.valueOf(name.charAt(0)).toLowerCase() + name.substring(1);
                }
            } else {
                return name;
            }
        }
        return String.valueOf(name.charAt(0)).toUpperCase();

    }

    public static void main(String [] args) {

        String s = formatProperties("bcd");
        System.out.println(s);

    }

}
