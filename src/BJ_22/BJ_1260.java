package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_1260 {
    public static int v, e, start; // 정점 개수, 간선 개수, 탐색 시작 정점
    public static boolean[] vertex; // 연결된 간선
    public static boolean[][] edge; // 방문한 정점 출력
    public static Queue<Integer> q = new LinkedList<>(); // 자료 구조 Queue
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        v = Integer.parseInt(st.nextToken()); // 정점 개수
        e = Integer.parseInt(st.nextToken()); // 간선 개수
        start = Integer.parseInt(st.nextToken()); // 탐색 시작 정점

        vertex = new boolean[v + 1]; // 방문한 정점을 체크하기 위한 1차원 배열
        edge = new boolean[v + 1][v + 1]; // 간선으로 연결된 정점을 체크하기 위한 2차원 배열

        for (int i = 0; i < e; i++) { // 간선의 개수만큼 양방향 연결
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken()); // 시작 정점
            int y = Integer.parseInt(st.nextToken()); // 끝 정점

            edge[x][y] = true; // 연결 처리
            edge[y][x] = true; // 연결 처리
        }

        dfs(start);
        vertex = new boolean[v + 1]; // 방문 처리 초기화
        sb.append("\n");
        bfs();
        System.out.println(sb);
    }

    public static void dfs(int k) {
        vertex[k] = true; // 방문 처리
        sb.append(k).append(" "); // 방문한 정점 출력
        for (int i = 1; i <= v; i++) { // 1번 정점부터 정점의 개수만큼 반복
            if (edge[k][i] && !vertex[i]) { // 연결이 되어 있고, 방문하지 않았을 경우 방문
                dfs(i); // 재귀 함수 dfs() 호출
            }
        }
    }

    public static void bfs() {
        q.offer(start); // 시작 정점 offer (= push)
        vertex[start] = true; // 방문 처리
        while (!q.isEmpty()) { // q가 비어있지 않으면 반복
            int k = q.poll(); //  q의 값을 k로 뱉으면서 poll (= pop)
            sb.append(k).append(" "); // 방문한 정점 출력
            for (int i = 1; i <= v; i++) { // 1번 정점부터 정점의 개수만큼 반복
                if (edge[k][i] && !vertex[i]) { // 연결이 되어 있고, 방문하지 않았을 경우 방문
                    q.offer(i); // 방문 정점 offer (= push)
                    vertex[i] = true; // 방문 처리
                }
            }
        }
    }
}