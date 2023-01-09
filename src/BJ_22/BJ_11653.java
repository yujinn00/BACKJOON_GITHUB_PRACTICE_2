package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int b = 2; // 소인수 초기화

        while (a != 1) {
            if (a % b == 0) {
                a /= b;
                sb.append(b).append("\n");
            } else {
                b++;
            }
        }

        System.out.println(sb);
    }
}