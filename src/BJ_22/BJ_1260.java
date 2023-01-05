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

    public static void dfs(int k) { // 깊이 우선 탐색
        visited[k] = true; // 방문 처리
        System.out.print(k + " "); // 방문한 정점 출력
        for (int i = 1; i <= n; i++) { // 1번 정점부터 n번 정점까지 반복
            if (graph[k][i] && !visited[i]) { // 연결이 되어 있고, 방문하지 않았을 경우 방문
                dfs(i);
            }
        }
    }

    public static void bfs() { // 너비 우선 탐색 // Queue 자료 구조 사용
        q.offer(start); // 시작 정점 push (= offer)
        visited[start] = true; // 방문 처리
        while (!q.isEmpty()) { // q가 비어있지 않으면 반복
            int k = q.poll(); //  q의 값을 k로 뱉으면서 poll (= pop)
            System.out.print(k + " "); // 방문한 정점 출력
            for (int i = 1; i <= n; i++) { // dfs와 같은 로직
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

        n = Integer.parseInt(st.nextToken()); // 정점의 개수
        m = Integer.parseInt(st.nextToken()); // 간선의 개수
        start = Integer.parseInt(st.nextToken()); // 탐색 시작 정점

        graph = new boolean[n + 1][n + 1]; // 간선으로 연결된 정점을 체크하기 위한 2차원 배열
        visited = new boolean[n + 1]; // 방문한 정점을 체크하기 위한 1차원 배열

        for(int i = 0; i < m; i++){ // 간선의 개수만큼 양방향 연결
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken()); // 시작 정점
            int y = Integer.parseInt(st.nextToken()); // 끝 정점
            
            graph[x][y] = true; // 연결 처리
            graph[y][x] = true; // 연결 처리
        }

        dfs(start);
        visited = new boolean[n + 1]; // 방문 처리 초기화
        System.out.println();
        bfs();
    }
}