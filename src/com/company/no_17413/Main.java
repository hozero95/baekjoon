package com.company.no_17413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<>();
        String str = br.readLine();
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') {
                print(stack);
                flag = true;
                System.out.print(str.charAt(i));
            } else if (str.charAt(i) == '>') {
                flag = false;
                System.out.print(str.charAt(i));
            } else if (flag) {
                System.out.print(str.charAt(i));
            } else {
                if (str.charAt(i) == ' ') {
                    print(stack);
                    System.out.print(str.charAt(i));
                } else {
                    stack.push(String.valueOf(str.charAt(i)));
                }
            }
        }
        print(stack);
    }

    public static void print(Stack stack) {
        while (!stack.isEmpty()) {
            System.out.print(stack.peek());
            stack.pop();
        }
    }
}
