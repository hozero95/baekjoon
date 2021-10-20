package com.company.no_4963;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static BufferedReader br;
    public static StringTokenizer st;
    public static StringBuilder sb;
    public static int w;
    public static int h;
    public static int count;
    public static int[][] island;
    public static int[][] moves;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        // {상, 하, 좌, 우, 좌상, 우상, 죄하, 우하}
        moves = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            count = 0;

            if (w == 0 && h == 0) {
                break;
            }

            island = new int[h][w];

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < w; j++) {
                    island[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (island[i][j] == 1) {
                        count++;
                        dfs(i, j);
                    }
                }
            }

            sb.append(count + "\n");
        }

        System.out.println(sb);
    }

    public static void dfs(int x, int y) {
        island[x][y] = 0;

        for (int[] move : moves) {
            int xx = x + move[0];
            int yy = y + move[1];

            if (xx >= 0 && yy >= 0 && xx < h && yy < w) {
                if (island[xx][yy] == 1) {
                    dfs(xx, yy);
                }
            }
        }
    }
}
