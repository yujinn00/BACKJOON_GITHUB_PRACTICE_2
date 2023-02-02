package BJ_23_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1018 {
    public static char[][] chess;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        chess = new char[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            for (int j = 0; j < m; j++) {
                chess[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < n - 7; i++) { // 최대 경우의 수
            for (int j = 0; j < m - 7; j++) { // 최대 경우의 수
                board(i, j);
            }
        }

        System.out.println(min);
    }

    public static void board(int a, int b) { // 8x8 크기의 체스판 체크
        int count = 0;

        char color = chess[a][b];

        for (int i = a; i < a + 8; i++) {
            for (int j = b; j < b + 8; j++) {
                if (chess[i][j] != color) {
                    count++;
                }
                color = (color == 'W' ? 'B' : 'W'); // 열 바뀔 때마다 color 반전 // W이면 B로 설정, B이면 W로 설정
            }
            color = (color == 'W' ? 'B' : 'W'); // 행 바뀔 때마다 color 반전 // W이면 B로 설정, B이면 W로 설정
        }

        count = Math.min(count, 64 - count); // 첫 번째 칸의 색을 기준으로 할 때의 count와 첫 번째 칸의 색과 반대되는 색을 기준으로 할 때의 count를 비교하여 최솟값을 갱신 (★)
        min = Math.min(min, count); // 이전까지의 최솟값과 현재 count의 값을 비교하여 최솟값을 갱신
    }
}