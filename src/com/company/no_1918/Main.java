package com.company.no_1918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> op = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char[] str = br.readLine().toCharArray();

        for (int i = 0; i < str.length; i++) {
            if (str[i] >= 'A' && str[i] <= 'Z') {
                sb.append(str[i]);
            } else {
                if (str[i] == '(') {
                    op.push(str[i]);
                } else if (str[i] == ')') {
                    while (!op.isEmpty() && op.peek() != '(') {
                        sb.append(op.pop());
                    }
                    op.pop();
                } else {
                    while (!op.isEmpty() && operation(op.peek()) >= operation(str[i])) {
                        sb.append(op.pop());
                    }
                    op.push(str[i]);
                }
            }
        }
        while (!op.isEmpty()) {
            sb.append(op.pop());
        }
        System.out.println(sb);
    }

    public static int operation(char op) {
        if (op == '*' || op == '/') {
            return 2;
        } else if (op == '+' || op == '-') {
            return 1;
        } else {
            return 0;
        }
    }
}
