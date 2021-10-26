package com.company.no_4803;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int n;
    private static int m;
    private static int t;
    private static int count;
    private static ArrayList<Integer>[] tree;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        t = 1;

        while (true) {
            // input
            st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            // loop end
            if (n == 0 && m == 0) {
                break;
            }

            // initialize
            count = 0;
            tree = new ArrayList[n];
            visited = new boolean[n];
            for (int i = 0; i < n; i++) {
                tree[i] = new ArrayList<>();
            }

            // tree set
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int a = Integer.parseInt(st.nextToken()) - 1;
                int b = Integer.parseInt(st.nextToken()) - 1;
                tree[a].add(b);
                tree[b].add(a);
            }

            // dfs
            // 모든 노드가 번갈아가면서 root 노드가 되고, 해당 노드에서 연결된 모든 노드를 검사하여 방문 체크를 하고, true를 반환하여 하나의 트리를 완성함.
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    if (dfs(-1, i)) {
                        count++;
                    }
                }
            }

            // print
            sb.append("Case " + t + ": ");
            if (count == 0) {
                sb.append("No trees.\n");
            } else if (count == 1) {
                sb.append("There is one tree.\n");
            } else {
                sb.append("A forest of " + count + " trees.\n");
            }
            t++;
        }

        System.out.println(sb);
    }

    public static boolean dfs(int root, int num) {
        for (int i : tree[num]) {
            // 이전 노드(방문했던 노드) 제외
            if (i == root) {
                continue;
            }

            // 다음 노드 방문 여부 검사
            // 다음 노드가 방문이 된 노드라면 tree가 아니라고 판단하여 false를 반환하고 count를 증가시키지 않고 다음 노드를 검사함
            if (visited[i]) {
                return false;
            } else {
                visited[i] = true;
                if (!dfs(num, i)) {
                    return true;
                }
            }
        }
        return true;
    }
}
