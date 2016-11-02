package javaDataStructure;

import java.io.IOException;

/**
 * 压栈出栈的方法实现字符串反转
 * Created by LuoSw on 2016/10/25 0025.
 */
public class StringReverserThroughStack {

    private String input;

    private StringReverserThroughStack(String s) {
        input = s;
    }

    private String doRev() {
        int stackSize = input.length();
        Stack stack = new Stack(stackSize);
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
        }
        String output = "";
        while (!stack.isEmpty()) {
            char ch = stack.pop();
            output = output + ch;
        }
        return output;
    }

    public static void main(String[] args) throws IOException {

        String input = "罗绍伟";
        String output;
        StringReverserThroughStack stringReverserThroughStack = new StringReverserThroughStack(input);
        output = stringReverserThroughStack.doRev();
        System.out.println(input);
        System.out.println(output);

    }

    private class Stack {

        private int maxSize;
        private char[] stackArray;
        private int top;

        private Stack(int max) {
            maxSize = max;
            stackArray = new char[maxSize];
            top = -1;
        }

        private void push(char j) {
            stackArray[++top] = j;
        }

        private char pop() {
            return stackArray[top--];
        }

        private char peek() {
            return stackArray[top];
        }

        private boolean isEmpty() {
            return (top == -1);
        }

    }

}
