package BJ_23_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_2178 {
    public static int n, m; // 미로의 크기
    public static int[][] maze; // 미로의 이동 가능 확인을 위한 2차원 배열
    public static boolean[][] visit; // 미로의 방문 확인을 위한 2차원 배열
    public static Queue<int[]> q = new LinkedList<>(); // 자료 구조 Queue
    public static int[] dirX = {0, 0, -1, 1}; // x 좌표 상하좌우
    public static int[] dirY = {1, -1, 0, 0}; // y 좌표 상하좌우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 미로의 크기 입력 (x 좌표)
        m = Integer.parseInt(st.nextToken()); // 미로의 크기 입력 (y 좌표)

        maze = new int[n][m]; // 미로의 이동 가능 확인을 위한 2차원 배열 선언
        visit = new boolean[n][m]; // 미로의 방문 확인을 위한 2차원 배열 선언

        for (int i = 0; i < n; i++) {
            String str = br.readLine(); // 임시적으로 사용할 문자열 입력

            for (int j = 0; j < m; j++) {
                maze[i][j] = str.charAt(j) -'0'; // char 문자를 숫자로 변환
            }
        }

        bfs(); // 최단 거리를 구하기 위한 bfs() 함수 호출
        System.out.println(maze[n - 1][m - 1]); // 도착 위치의 값 출력 (= 최단 거리 출력)
    }

    public static void bfs() { // bfs() 함수가 자동으로 최단 거리를 계산해주는 이유 : 한 칸씩 이동하면서 1을 더해주는데, 만약 도착 위치까지 이동했다면 더 이상 이동할 필요는 없고, 지금까지 더한 값이 곧 최단 거리가 되기 때문 !!
        q.offer(new int[] {0, 0}); // 시작 위치를 Queue에 저장 (= push)
        visit[0][0] = true; // 시작 위치 방문 처리

        while (!q.isEmpty()) { // q가 비어질 때까지 반복
            int[] dir = q.poll(); // push된 위치를 빼내고 반환 (= pop)

            for (int i = 0; i < 4; i++) {
                int nowX = dir[0] + dirX[i]; // pull된 위치의 x 좌표를 상하좌우로 이동 (dir[0] = pull된 위치의 x 좌표)
                int nowY = dir[1] + dirY[i]; // pull된 위치의 y 좌표를 상하좌우로 이동 (dir[1] = pull된 위치의 y 좌표)

                if (nowX >= 0 && nowY >= 0 && nowX < n && nowY < m) { // 이동된 좌표가 미로의 크기 안이면 실행
                    if (maze[nowX][nowY] == 1 && !visit[nowX][nowY]) { // 미로의 이동이 가능하고, 방문하지 않았으면 실행
                        q.offer(new int[] {nowX, nowY}); // 이동 후 현재 위치를 Queue에 저장 (= push)
                        maze[nowX][nowY] = maze[dir[0]][dir[1]] + 1; // 이동하기 전 위치의 값에 1을 더하여 현재 위치의 값에 저장
                        visit[nowX][nowY] = true; // 현재 위치 방문 처리
                    }
                }
            }
        }
    }
}