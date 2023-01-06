package BJ_23_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2606 {
    static int a, b, start = 1, count = -1;
    static boolean[][] graph;
    static boolean[] visited;

    public static void dfs(int k) {
        visited[k] = true;
        count++;
        for (int i = 1; i <= a; i++) {
            if (graph[k][i] && !visited[i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.parseInt(br.readLine()); // 컴퓨터의 수
        b = Integer.parseInt(br.readLine()); // 컴퓨터 쌍의 수

        graph = new boolean[a + 1][a + 1]; // 쌍으로 연결된 컴퓨터를 체크하기 위한 2차원 배열
        visited = new boolean[a + 1]; // 감염된 컴퓨터를 체크하기 위한 1차원 배열

        for (int i = 0; i < b; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int c = Integer.parseInt(st.nextToken()); // 연결 컴퓨터 1
            int d = Integer.parseInt(st.nextToken()); // 연결 컴퓨터 2

            graph[c][d] = true; // 감염 처리
            graph[d][c] = true; // 감염 처리
        }

        dfs(start);
        System.out.println(count);
    }
}