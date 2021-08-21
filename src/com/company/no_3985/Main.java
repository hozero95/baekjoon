package com.company.no_3985;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l, n;

        // 롤 케이크의 길이, 방청객의 수 입력
        l = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());

        // 방청객이 종이에 적어낸 수 배열 구현
        int[][] nArr = new int[n][3];

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            nArr[i][0] = Integer.parseInt(str[0]) - 1;
            nArr[i][1] = Integer.parseInt(str[1]) - 1;
        }

        // 가장 많은 조각을 받도록 예상되는 방척객 번호 출력
        int max = 0;

        for (int i = 1; i < nArr.length; i++) {
            if ((nArr[max][1] - nArr[max][0]) < (nArr[i][1] - nArr[i][0])) {
                max = i;
            }
        }

        System.out.println(max + 1);

        // 실제로 가장 많은 조각을 받은 방청객 번호 출력
        int[] cake = new int[l];
        int realMax = 0;

        for (int i = 0; i < nArr.length; i++) {
            for (int j = nArr[i][1]; j >= nArr[i][0]; j--) {
                if (cake[j] == 0) {
                    cake[j] = i + 1;
                    nArr[i][2]++;
                }
            }
        }

        for (int i = 1; i < nArr.length; i++) {
            if (nArr[realMax][2] < nArr[i][2]) {
                realMax = i;
            }
        }

        System.out.println(realMax + 1);

        br.close();
    }
}
