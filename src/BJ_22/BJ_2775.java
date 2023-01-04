package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] b = new int[15][15];

        for (int i = 1; i <= 14; i++) {
            b[0][i] = i;
        }

        for (int i = 1; i <= 14; i++) {
            for (int j = 1; j <= 14; j++) {
                b[i][j] = b[i - 1][j] + b[i][j - 1];
            }
        }

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            int floor = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());

            System.out.println(b[floor][room]);
        }
    }
}