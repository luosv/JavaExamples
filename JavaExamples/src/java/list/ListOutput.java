package java.list;

/**
 * 数组输出
 * Created by luosv on 2016/10/14 0014.
 */
public class ListOutput {

    public static void main(String[] args) {

        String[] greeting = new String[3];

        greeting[0] = "This is the greeting";
        greeting[1] = "for all the readers from";
        greeting[2] = "Java Source";

        for (int i = 0; i < greeting.length; i++) {
            System.out.print(greeting[i]);
        }

        System.out.println();

        for (String j : greeting) {
            System.out.print(j);
        }

    }

}
