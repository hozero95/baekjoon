package com.company.no_10824;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] num = br.readLine().split(" ");

        long a = Long.parseLong(String.valueOf(sb.append(num[0]).append(num[1])));
        sb.setLength(0);
        long b = Long.parseLong(String.valueOf(sb.append(num[2]).append(num[3])));

        bw.write(String.valueOf(a + b));

        bw.flush();
        bw.close();
        br.close();
    }
}
