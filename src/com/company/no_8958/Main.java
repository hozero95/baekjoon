package com.company.no_8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int score = 0, total = 0;
            String testStr = br.readLine();

            for (String str : testStr.split("")) {
                if (str.equals("O")) {
                    score++;
                } else {
                    score = 0;
                }
                total += score;
            }

            System.out.println(total);
        }

        br.close();
    }
}
