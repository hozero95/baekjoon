package com.company.no_14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static BufferedReader br;
    public static StringTokenizer st;
    public static int min;
    public static int max;
    public static int n;
    public static int[] a;
    public static boolean[] isUsed;
    public static String[] op;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        n = Integer.parseInt(br.readLine());
        a = new int[n];
        isUsed = new boolean[n];
        op = new String[n - 1];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; st.hasMoreTokens(); i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int index = 0;
        String operators = "+-*/";
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; st.hasMoreTokens(); i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp > 0) {
                String operator = operators.substring(i, i + 1);
                while (temp-- > 0) {
                    op[index++] = operator;
                }
            }
        }

        dfs(1, a[0]);

        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(int depth, int result) {
        if (depth == n) {
            if (max < result) {
                max = result;
            }
            if (min > result) {
                min = result;
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                int cur = a[depth];
                if (!isUsed[i]) {
                    isUsed[i] = true;
                    int temp = calc(result, cur, op[i]);
                    dfs(depth + 1, temp);
                    isUsed[i] = false;
                }
            }
        }
    }

    public static int calc(int result, int num, String op) {
        switch (op) {
            case "+":
                result += num;
                break;
            case "-":
                result -= num;
                break;
            case "*":
                result *= num;
                break;
            case "/":
                result /= num;
                break;
        }
        return result;
    }
}
