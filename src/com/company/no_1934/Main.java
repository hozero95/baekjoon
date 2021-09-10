package com.company.no_1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] str = br.readLine().split(" ");
            int[] num = new int[str.length];
            for (int j = 0; j < str.length; j++) {
                num[j] = Integer.parseInt(str[j]);
            }
            int gcd = gcd(num[0], num[1]);
            System.out.println(num[0] * num[1] / gcd);
        }
    }

    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return gcd(num2, num1 % num2);
        }
    }
}
