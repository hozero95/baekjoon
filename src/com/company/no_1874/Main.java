package com.company.no_1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        boolean flag = true;
        int value = 1;

        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(br.readLine());

            while (value <= num[i]) {
                stack.push(value++);
                sb.append("+\n");
            }

            if (stack.isEmpty()) {
                flag = false;
                break;
            } else {
                while (stack.peek() >= num[i]) {
                    stack.pop();
                    sb.append("-\n");
                    if (stack.isEmpty()) {
                        break;
                    }
                }
            }
        }

        if (flag) {
            System.out.print(sb);
        } else {
            System.out.print("NO");
        }
    }
}
