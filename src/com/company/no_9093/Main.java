package com.company.no_9093;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] str = new String[t];

        for(int i = 0; i < str.length; i++){
            str[i] = br.readLine();
            String[] temp = str[i].split(" ");
            String result = "";

            for(int j = 0; j < temp.length; j++){
                StringBuffer sb = new StringBuffer(temp[j]);
                temp[j] = sb.reverse().toString();
                result += temp[j] + " ";
            }

            System.out.println(result);
        }
    }
}
