package com.company.no_1406;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();
        String str = br.readLine();
        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < str.length(); i++) {
            left.push(str.substring(i, i + 1));
        }

        for (int i = 0; i < m; i++) {
            String command = br.readLine();

            switch (command.split(" ")[0]) {
                case "L":
                    if (!left.isEmpty()) {
                        right.push(left.pop());
                    }
                    break;
                case "D":
                    if (!right.isEmpty()) {
                        left.push(right.pop());
                    }
                    break;
                case "B":
                    if (!left.isEmpty()) {
                        left.pop();
                    }
                    break;
                case "P":
                    left.push(command.split(" ")[1]);
                    break;
            }
        }

        while (!left.isEmpty()) {
            right.push(left.pop());
        }

        while (!right.isEmpty()) {
            bw.write(right.pop());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
