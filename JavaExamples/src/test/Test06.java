package test;

/**
 * 测试题06
 * Created by luosv on 2017/6/20 0020.
 */
public class Test06 {

    public int aMethod() {
        //static int i = 0;
        //方法内部不能含有静态变量！！！
        int i = 0;
        i++;
        return i;
    }

    public static void main(String[] args) {
        Test06 test06 = new Test06();
        test06.aMethod();
        int j = test06.aMethod();
        System.out.println(j);
        test06.findStr();
    }

    public void findStr() {
        String s = "welcome to mldn !!";
        System.out.println(s.charAt(2));
        System.out.println(s.indexOf('t'));
    }

}

class Base {

    private void aMethod(int iBase) {
        System.out.println("Base.aMethod");
    }

}

class Over extends Base {

    public static void main(String[] args) {
        Over over = new Over();
        int iBase = 0;
        over.aMethod(iBase);
    }

    public void aMethod(int iOver) {
        System.out.println("Over.aMethod");
    }

}
