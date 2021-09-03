package com.company.no_10820;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        while ((str = br.readLine()) != null) {
            int[] result = new int[4];

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) >= 'a' && str.charAt(j) <= 'z') {
                    result[0]++;
                } else if (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') {
                    result[1]++;
                } else if (str.charAt(j) >= 48 && str.charAt(j) <= 57) {
                    result[2]++;
                } else if (str.charAt(j) == ' ') {
                    result[3]++;
                }
            }

            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }

        br.close();
    }
}
