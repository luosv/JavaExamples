package javaDataStructure;

import java.io.IOException;

/**
 * 利用堆栈将中缀表达式转换成后缀表达式
 * Created by luosv on 2016/10/25 0025.
 */
public class InToPost {

    private Stack theStack;
    private String input;
    private String output = "";

    private InToPost(String in) {
        input = in;
        int stackSize = input.length();
        theStack = new Stack(stackSize);
    }

    private String doTrans() {
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '+':
                case '-':
                    gotOper(ch, 1);
                    break;
                case '*':
                case '/':
                    gotOper(ch, 2);
                    break;
                case '(':
                    theStack.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    output = output + ch;
                    break;
            }
        }
        while (!theStack.isEmpty()) {
            output = output + theStack.pop();
        }
        System.out.println(output);
        return output;
    }

    private void gotOper(char opThis, int prec1) {
        while (!theStack.isEmpty()) {
            char opTop = theStack.pop();
            if (opTop == '(') {
                theStack.push(opTop);
                break;
            } else {
                int prec2;
                if (opTop == '+' || opTop == '-') {
                    prec2 = 1;
                } else {
                    prec2 = 2;
                }
                if (prec2 < prec1) {
                    theStack.push(opTop);
                    break;
                } else {
                    output = output + opTop;
                }
            }
        }
        theStack.push(opThis);
    }

    private void gotParen(char ch) {
        while (!theStack.isEmpty()) {
            char chx = theStack.pop();
            if (chx == '(') {
                break;
            } else {
                output = output + chx;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        String input = "1+2*4/5-7+3/6";
        String output;
        InToPost theTrans = new InToPost(input);
        output = theTrans.doTrans();
        System.out.println("Postfix is " + output + '\n');

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
