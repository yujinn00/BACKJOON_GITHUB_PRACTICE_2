package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count_i = a;

        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(st.nextToken());

            if (b == 1) {
                count_i--;
                continue;
            }

            int count_j = 0;

            for (int j = 1; j <= b; j++) {
                if (b % j == 0) {
                    count_j++;
                }
                if (count_j > 2) {
                    count_i--;
                    break;
                }
            }
        }
        System.out.println(count_i);
    }
}