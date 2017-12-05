package java.data.structure;

/**
 * 栈的实现
 * Created by luosv on 2016/10/25 0025.
 */
public class ImplementationOfStacks {

    private int maxSize;
    private long[] stackArray;
    private int top;

    private ImplementationOfStacks(int i) {
        maxSize = i;
        stackArray = new long[maxSize];
        top = -1;
    }

    private void push(long j) {
        stackArray[++top] = j;
    }

    private long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    private boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {

        ImplementationOfStacks implementationOfStacks = new ImplementationOfStacks(10);

        implementationOfStacks.push(10);
        implementationOfStacks.push(20);
        implementationOfStacks.push(30);
        implementationOfStacks.push(40);
        implementationOfStacks.push(50);

        while (!implementationOfStacks.isEmpty()) {
            long value = implementationOfStacks.pop();
            System.out.print(value);
            System.out.print(" ");
        }

        System.out.println(" ");

    }

}
