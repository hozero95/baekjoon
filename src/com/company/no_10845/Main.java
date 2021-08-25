package com.company.no_10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String command = br.readLine();

            switch (command.split(" ")[0]) {
                case "push":
                    deque.add(Integer.parseInt(command.split(" ")[1]));
                    break;
                case "pop":
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.poll());
                    }
                    break;
                case "size":
                    System.out.println(deque.size());
                    break;
                case "empty":
                    if (deque.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.peek());
                    }
                    break;
                case "back":
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.getLast());
                    }
                    break;
            }
        }

        br.close();
    }
}
