package com.company.no_2004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        long n = Long.parseLong(str.split(" ")[0]);
        long m = Long.parseLong(str.split(" ")[1]);
        long count5 = five_power_n(n) - five_power_n(n - m) - five_power_n(m);
        long count2 = two_power_n(n) - two_power_n(n - m) - two_power_n(m);

        System.out.println(Math.min(count5, count2));
    }

    public static long five_power_n(long n) {
        long count = 0;

        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }

        return count;
    }

    public static long two_power_n(long n) {
        long count = 0;

        while (n >= 2) {
            count += n / 2;
            n /= 2;
        }

        return count;
    }
}
