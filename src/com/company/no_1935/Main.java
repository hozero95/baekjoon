package com.company.no_1935;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Double> stack = new Stack<>();
        HashMap<Character, Double> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        char[] postfix = br.readLine().toCharArray();
        double result = 0.0;

        for (int i = 0; i < postfix.length; i++) {
            if (postfix[i] >= 'A' && postfix[i] <= 'Z') {
                if (!map.containsKey(postfix[i])) {
                    map.put(postfix[i], Double.parseDouble(br.readLine()));
                }
                stack.push(map.get(postfix[i]));
            } else {
                double temp = stack.pop();
                switch (postfix[i]) {
                    case '+':
                        result = stack.pop() + temp;
                        break;
                    case '-':
                        result = stack.pop() - temp;
                        break;
                    case '*':
                        result = stack.pop() * temp;
                        break;
                    case '/':
                        result = stack.pop() / temp;
                        break;
                }
                stack.push(result);
            }
        }

        System.out.printf("%.2f", stack.pop());
    }
}
