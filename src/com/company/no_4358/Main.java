package com.company.no_4358;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        int total = 0;

        while (true) {
            String str = br.readLine();
            if (str == null || str.equals("")) {
                break;
            }
            map.put(str, map.getOrDefault(str, 0) + 1);
            total++;
        }

        for (String s : map.keySet()) {
            list.add(s);
        }
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " " + String.format("%.4f", (double) map.get(list.get(i)) * 100 / total));
        }
    }
}
