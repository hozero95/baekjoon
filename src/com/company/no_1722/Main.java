package com.company.no_1722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int k = Integer.parseInt(st.nextToken());

        // 중복 제거용 flag
        boolean[] flag = new boolean[n + 1];

        // factorial 구하기
        long[] factorial = new long[n + 1];
        factorial[0] = 1;
        for (int i = 1; i < factorial.length; i++) {
            factorial[i] = factorial[i - 1] * i;
        }

        if (k == 1) {
            long num = Long.parseLong(st.nextToken());
            int[] result = new int[n];

            for (int i = 0; i < n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (flag[j]) {
                        continue;
                    }
                    if (factorial[n - i - 1] < num) {
                        num -= factorial[n - i - 1];
                    } else {
                        result[i] = j;
                        flag[j] = true;
                        break;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
        } else if (k == 2) {
            int[] temp = new int[n];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = Integer.parseInt(st.nextToken());
            }

            long result = 1L;

            for (int i = 0; i < n; i++) {
                for (int j = 1; j < temp[i]; j++) {
                    if (!flag[j]) {
                        result += factorial[n - i - 1];
                    }
                }
                flag[temp[i]] = true;
            }
            System.out.println(result);
        }

        br.close();
    }
}
