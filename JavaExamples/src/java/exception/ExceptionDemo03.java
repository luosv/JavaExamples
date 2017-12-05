package java.exception;

/**
 * Finally的用法
 * Created by luosv on 2016/10/21 0021.
 */
public class ExceptionDemo03 {

    public static void main(String[] args) {

        new ExceptionDemo03().doTheWork();

    }

    private void doTheWork() {

        Object o = null;
        for (int i = 0; i < 5; i++) {
            try {
                o = makeObj(i);
            } catch (IllegalArgumentException e) {
                System.err.println("Error: (" + e.getMessage() + ").");
                return;
            } finally {
                System.err.println("都已执行完毕");
                if (o == null) {
                    System.exit(0);
                }

            }
            System.out.println(o);
        }

    }

    private Object makeObj(int type) throws IllegalArgumentException {

        if (type == 1) {
            throw new IllegalArgumentException("不是指定类型： " + type);
        }
        return new Object();

    }

}
