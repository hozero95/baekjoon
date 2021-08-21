package com.company.no_2999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int r = 0, c = 0;
        boolean flag = false;

        // 받은 메시지 입력
        str = br.readLine();

        // 배열 크기 설정
        for (int i = str.length(); i > 0; i--) {
            for (int j = str.length(); j >= i; j--) {
                if (j * i == str.length()) {
                    r = i;
                    c = j;
                    flag = true;
                    break;
                }
            }

            if (flag) {
                break;
            }
        }

        // 정인이가 만든 행렬 구현
        String[][] strArr = new String[r][c];
        String[] strSplit = str.split("");
        int strNum = 0;

        for (int i = 0; i < strArr[0].length; i++) {
            for (int j = 0; j < strArr.length; j++) {
                strArr[j][i] = strSplit[strNum];
                strNum++;
            }
        }

        // 해독한 메시지 출력
        str = "";
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                str += strArr[i][j];
            }
        }

        System.out.println(str);

        br.close();
    }
}
