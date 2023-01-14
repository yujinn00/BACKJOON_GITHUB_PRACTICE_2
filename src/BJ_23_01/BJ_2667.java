package BJ_23_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BJ_2667 {
    public static int n; // 지도의 크기
    public static int[][] house; // 집 유무 확인을 위한 2차원 배열
    public static boolean[][] visit; // 집 방문 확인을 위한 2차원 배열
    public static int count; // 단지 내 집의 수
    public static ArrayList<Integer> counts = new ArrayList<>(); // 단지 내 집의 수의 배열 (정렬 예정)
    public static int[] dirX = { 0, 0, -1, 1 }; // x 좌표 상하좌우
    public static int[] dirY = { 1, -1, 0, 0 }; // y 좌표 상하좌우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine()); // 지도의 크기 입력

        house = new int[n][n]; // 집 유무 확인을 위한 2차원 배열 선언
        visit = new boolean[n][n]; // 집 방문 확인을 위한 2차원 배열 선언

        for (int i = 0; i < n; i++) {
            String str = br.readLine(); // 임시적으로 사용할 문자열 입력

            for (int j = 0; j < n; j++) {
                house[i][j] = str.charAt(j) - '0'; // char 문자를 숫자로 변환
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (house[i][j] == 1 && !visit[i][j]) { // 집이 있고, 방문하지 않았으면 실행
                    count = 1; // 단지 내 집의 수를 1로 초기화
                    dfs(i, j); // dfs() 함수를 통해 단지 내 집의 수 재설정
                    counts.add(count); // 최종적으로 재설정된 단지 내 집의 수를 배열에 추가
                }
            }
        }

        Collections.sort(counts); // 오름차순 정렬 (ArrayList 정렬은 Arrays.sort() 함수가 아닌 Collections.sort() 함수를 활용해야 함 !!)
        sb.append(counts.size()).append("\n"); // 단지 수 출력

        for (int i : counts) {
            sb.append(i).append("\n"); // 각 단지 내 집의 수 출력
        }

        System.out.println(sb);
    }

    public static void dfs(int x, int y) {
        visit[x][y] = true; // 방문 처리

        for (int i = 0; i < 4; i++) {
            int nowX = x + dirX[i]; // x 좌표를 상하좌우로 이동
            int nowY = y + dirY[i]; // y 좌표를 상하좌우로 이동

            if (nowX >= 0 && nowY >= 0 && nowX < n && nowY < n) { // 이동된 좌표가 지도의 크기 안이면 실행
                if (house[nowX][nowY] == 1 && !visit[nowX][nowY]) { // 집이 있고, 방문하지 않았으면 실행
                    count++; // 단지 내 집의 수 증가
                    dfs(nowX, nowY); // dfs() 재귀 함수 호출
                }
            }
        }
    }
}