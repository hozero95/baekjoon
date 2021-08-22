package com.company.no_11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] p = br.readLine().split(" ");

        int[] time = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            time[i] = Integer.parseInt(p[i]);
        }

        Arrays.sort(time);

        int prev = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += prev + time[i];
            prev += time[i];
        }

        System.out.println(sum);

        br.close();
    }
}
