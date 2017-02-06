package other;

/**
 * getStack
 * Created by luosv on 2016/11/2 0002.
 */
public class GetStack {

    private static String getStack() {

        Exception exception = new Exception();
        StackTraceElement[] stackTrace = exception.getStackTrace();
        StringBuilder buffer = new StringBuilder(); // 单线程用StringBuilder速度快、多线程用StringBuffer线程安全
        buffer.append("\n");
        for (StackTraceElement stackTraceElement : stackTrace) {
            buffer.append(stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName())
                    .append(".").append(stackTraceElement.getLineNumber()).append("\n");
        }
        return buffer.toString();

    }

    public static void main(String[] args) {

        String s = getStack();
        System.out.println(s);

    }

}
