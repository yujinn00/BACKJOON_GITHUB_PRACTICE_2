package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_1260 {
    static int n, m, start;
    static boolean[][] graph;
    static boolean[] visited;
    static Queue<Integer> q = new LinkedList<>();

    public static void dfs(int k) {
        visited[k] = true;
        System.out.print(k + " ");
        for (int i = 1; i <= n; i++) {
            if (graph[k][i] && !visited[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs() {
        q.offer(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            int k = q.poll();
            System.out.print(k + " ");
            for (int i = 1; i <= n; i++) {
                if (graph[k][i] && !visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        start = Integer.parseInt(st.nextToken());
        graph = new boolean[n + 1][n + 1];
        visited = new boolean[n + 1];

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }
        dfs(start);
        visited = new boolean[n + 1];
        System.out.println();
        bfs();
    }
}