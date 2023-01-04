package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_14492 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int a = Integer.parseInt(br.readLine()); // 행렬 크기 입력
        int[][] b = new int[a][a]; // 첫 번째 행렬 선언
        int[][] c = new int[a][a]; // 두 번째 행력 선언
        int[][] d = new int[a][a]; // 부울곱된 행렬 선언
        int count = 0; // 1의 개수를 0으로 초기화

        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < a; j++) {
                b[i][j] = Integer.parseInt(st.nextToken()); // 첫 번째 행렬 입력
            }
        }

        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < a; j++) {
                c[i][j] = Integer.parseInt(st.nextToken()); // 두 번째 행렬 입력
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                int sum = 0;

                for (int k = 0; k < a; k++) {
                    sum += b[i][k] * c[k][j];

                    if (sum == 1) {
                        d[i][j] = 1;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (d[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}