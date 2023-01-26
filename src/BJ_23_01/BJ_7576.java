/*
1. 토마토가 익은 점들을 큐에 넣음 (동시다발적으로 일어나기 때문에 큐를 사용한 BFS)
2. 익은 토마토의 상하좌우를 탐색하며 익지 않은 토마토가 있으면 그 위치를 큐에 넣음 (그 위치의 값은 날짜를 계산하기 위해 전 위치에 1을 더함)
3. 큐가 빌 때까지 반복함
4. 전체 토마토들을 탐색하여 익지 않은 토마토가 하나라도 있으면 -1를 출력함
5. 그 외는 최대 일수를 출력함
*/
package BJ_23_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_7576 {
    public static int n, m; // 가로, 세로 칸의 수
    public static int[][] box; // 토마토가 보관된 상자를 의미하는 2차원 배열
    public static Queue<int[]> q = new LinkedList<>(); // 자료 구조 Queue (FIFO)
    public static int[] dirX = {0, 0, -1, 1}; // x 좌표 상하좌우
    public static int[] dirY = {1, -1, 0, 0}; // y 좌표 상하좌우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken()); // 가로 칸의 수 입력
        n = Integer.parseInt(st.nextToken()); // 세로 칸의 수 입력
        box = new int[n][m]; // n행 m열의 상자 선언

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                box[i][j] = Integer.parseInt(st.nextToken()); // 상자에 토마토 하나씩 할당

                if (box[i][j] == 1) { // 토마토가 익었으면 실행
                    q.offer(new int[] {i, j}); // 익은 토마토의 위치를 Queue에 저장 (= push)
                }
            }
        }

        System.out.println(bfs());
    }

    public static int bfs() {
        while (!q.isEmpty()) {
            int[] dir = q.poll(); // push된 위치를 빼내고 반환 (= pop)

            for (int i = 0; i < 4; i++) {
                int nowX = dir[0] + dirX[i]; // pull된 위치의 x 좌표를 상하좌우로 이동 (dir[0] = pull된 위치의 x 좌표)
                int nowY = dir[1] + dirY[i]; // pull된 위치의 y 좌표를 상하좌우로 이동 (dir[1] = pull된 위치의 y 좌표)

                if (nowX >= 0 && nowY >= 0 && nowX < n && nowY < m) { // 이동된 좌표가 상자의 크기 안이면 실행
                    if (box[nowX][nowY] == 0) { // 상자 안의 토마토가 아직 익지 않았으면 실행
                        q.offer(new int[] {nowX, nowY}); // 이동 후 현재 위치를 Queue에 저장 (= push)
                        box[nowX][nowY] = box[dir[0]][dir[1]] + 1; // 토마토가 익은 날짜를 얻기 위해 그 전 값에서 1 증가
                    }
                }
            }
        }

        int day = 0; // 모든 토마토가 익은 날짜의 초기값 설정

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0) { // 익지 않은 토마토가 있으면 -1 반환
                    return -1;
                }

                day = Math.max(day, box[i][j]); // 모든 토마토가 익은 날짜 갱신
            }
        }

        if (day == 1) { // 처음 저장될 때부터 토마토가 모두 익어 있으면 0 반환
            return 0;
        } else {
            return day - 1; // 정상적인 경우에서는 모든 토마토가 익은 날짜에 1을 빼서 반환
        }
    }
}