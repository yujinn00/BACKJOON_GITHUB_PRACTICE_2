package BJ_23_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_3085 {
    public static int n; // 보드의 크기
    public static char[][] board; // 사탕이 든 보드
    public static int max; // 먹을 수 있는 사탕의 최대 개수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine()); // 보드의 크기 입력
        board = new char[n][n]; // n행 n열의 보드 선언

        for (int i = 0; i < n; i++) {
            String candy = br.readLine(); // 사탕들 입력

            for (int j = 0; j < n; j++) {
                board[i][j] = candy.charAt(j); // 보드에 사탕 하나씩 할당
            }
        }

        for (int i = 0; i < n; i++) { // 행으로 인접한 두 사탕 교환하고, 최대 개수 구하고, 복구하기
            for (int j = 0; j < n - 1; j++) {
                char tmp = board[i][j]; // 교환
                board[i][j] = board[i][j + 1];
                board[i][j + 1] = tmp;

                eat(); // 최대 개수

                tmp = board[i][j]; // 복구
                board[i][j] = board[i][j + 1];
                board[i][j + 1] = tmp;
            }
        }

        for (int i = 0; i < n - 1; i++) { // 열로 인접한 두 사탕 교환하고, 최대 개수 구하고, 복구하기
            for (int j = 0; j < n; j++) {
                char tmp = board[i][j]; // 교환
                board[i][j] = board[i + 1][j];
                board[i + 1][j] = tmp;

                eat(); // 최대 개수

                tmp = board[i][j]; // 복구
                board[i][j] = board[i + 1][j];
                board[i + 1][j] = tmp;
            }
        }

        System.out.println(max); // 최대 개수 출력
    }

    public static void eat() {
        for (int i = 0; i < n; i++) { // 행 체크
            int count = 1; // 새로운 행마다 초기값 1 설정

            for (int j = 0; j < n - 1; j++) {
                if (board[i][j] == board[i][j + 1]) { // 이전 사탕과 동일한 경우, 계속 먹음
                    count++;
                } else { // 이전 사탕과 다른 경우, 새로 먹음
                    count = 1;
                }

                max = Math.max(max, count); // 사탕의 최대 개수 저장
            }
        }

        for (int i = 0; i < n; i++) { // 열 체크
            int count = 1; // 새로운 열마다 초기값 1 설정

            for (int j = 0; j < n - 1; j++) {
                if (board[j][i] == board[j + 1][i]) { // 이전 사탕과 동일한 경우, 계속 먹음
                    count++;
                } else { // 이전 사탕과 다른 경우, 새로 먹음
                    count = 1;
                }

                max = Math.max(max, count); // 사탕의 최대 개수 저장
            }
        }
    }
}