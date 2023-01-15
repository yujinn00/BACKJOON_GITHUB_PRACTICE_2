package BJ_23_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_2178 {
    public static int n, m;
    public static int[][] maze;
    public static boolean[][] visit;
    public static Queue<Integer[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        maze = new int[n][m];
        visit = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            for (int j = 0; j < m; j++) {
                maze[i][j] = str.charAt(j) - '0';
            }
        }

        visit[0][0] = true;


    }

    public static void bfs(int x, int y) {
        // 허허 이거 노드가 필요하네
    }
}