package com.company.no_11655;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch + 13);
                if(ch > 'z'){
                    ch -= 26;
                }
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 13);
                if(ch > 'Z'){
                    ch -= 26;
                }
            }
            result += ch;
        }

        System.out.println(result);
    }
}
