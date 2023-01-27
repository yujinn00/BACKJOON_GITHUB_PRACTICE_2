package BJ_23_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] matrix = new int[10][10]; // 0행 0열을 제외하고 입력하기 위함
        int max = -1, n = 0, m = 0;

        for (int i = 1; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 1; j < 10; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());

                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    n = i; m = j;
                }
            }
        }

        System.out.println(max);
        System.out.println(n + " " + m);
    }
}