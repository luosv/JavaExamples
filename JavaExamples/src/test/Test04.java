package test;

/**
 * 测试题04
 * Created by luosv on 2017/6/19 0019.
 */
public class Test04 {

    public static void main(String[] args) {

        int sum = 0;
        for (int x = 1; x < 10; x++) {
            sum += x;
            if (x % 3 == 0) {
                // 下面这continue就是误导，屁用没得，逻辑在上面都执行完了
//                continue;//停止当次循环进行下次
                break;
                //break的话就结束整个循环
            }
        }
        System.out.println("sum: " + sum);

    }

}
