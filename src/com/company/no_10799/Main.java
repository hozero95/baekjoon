package com.company.no_10799;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        String str = br.readLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("(")) {
                stack.push(i);
            } else {
                if (stack.peek() == i - 1) {
                    stack.pop();
                    count += stack.size();
                } else {
                    stack.pop();
                    count++;
                }
            }
        }
        System.out.println(count);

        br.close();
    }
}
