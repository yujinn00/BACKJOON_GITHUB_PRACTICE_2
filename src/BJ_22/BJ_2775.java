package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2775 {
    public static int[][] house = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        get_house();

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            int floor = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());

            sb.append(house[floor][room]).append("\n");
        }

        System.out.println(sb);
    }

    public static void get_house() {
        for (int i = 1; i <= 14; i++) { // 0층
            house[0][i] = i;
        }

        for (int i = 1; i <= 14; i++) { // 나머지 층
            for (int j = 1; j <= 14; j++) {
                house[i][j] = house[i - 1][j] + house[i][j - 1];
            }
        }
    }
}

/*
2/1 2/2 2/3
1/1 1/2 1/3
0/1 0/2 0/3

1    4    10
1    3    6
1    2    3

cf) 나머지 층 규칙 : house[i][j] = house[i - 1][j] + house[i][j - 1]
cf) 각 층의 1호는 무조건 1명 : (house[i - 1][1] house[i][0] == 0) => (house[i][1] == 1)
*/