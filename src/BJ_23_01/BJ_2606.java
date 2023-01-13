package BJ_23_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2606 {
    public static int v, e, start = 1, count = 0;
    public static boolean[] vertex;
    public static boolean[][] edge;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        v = Integer.parseInt(br.readLine()); // 컴퓨터 개수 (정점 개수)
        e = Integer.parseInt(br.readLine()); // 컴퓨터 쌍 개수 (간선 개수)

        vertex = new boolean[v + 1]; // 감염된 컴퓨터를 체크하기 위한 1차원 배열
        edge = new boolean[v + 1][v + 1]; // 쌍으로 연결된 컴퓨터를 체크하기 위한 2차원 배열

        for (int i = 0; i < e; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken()); // 연결 컴퓨터 1
            int y = Integer.parseInt(st.nextToken()); // 연결 컴퓨터 2

            edge[x][y] = true; // 연결 처리
            edge[y][x] = true; // 연결 처리
        }

        dfs(start);
        System.out.println(count);
    }

    public static void dfs(int k) { // 깊이 우선 탐색 // DFS, BFS 중 아무거나 활용해도 됨
        vertex[k] = true; // 감염 처리
        for (int i = 1; i <= v; i++) { // 1번 컴퓨터부터 컴퓨터 개수만큼 반복
            if (edge[k][i] && !vertex[i]) { // 연결되어 있고, 감염되지 않은 컴퓨터이면 실행
                count++; // 감염 수 증가
                dfs(i); // 재귀 함수 dfs() 호출
            }
        }
    }
}