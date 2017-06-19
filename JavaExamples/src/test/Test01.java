package test;

/**
 * 测试题01
 * 前置++是先+1再使用（其实是本身自增，但是自增之前会先定义一个副本，自增完成后返回副本的值），后置++先使用后自增
 * Created by luosv on 2017/6/19 0019.
 */
public class Test01 {

    public static void main(String[] args) {

        int i = 1;
        int j = i++;
        if ((i == (++j)) && ((i++) == j)) {
            i += j;
        }
        System.out.println("i = " + i);
        System.out.println("j = " + j);

    }

}
