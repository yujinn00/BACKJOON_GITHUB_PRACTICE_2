package BJ_23_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while (n >= 5) { // 5의 배수를 곱할 때마다 count 증가 (단, 5의 제곱들을 곱할 때는 그 제곱만큼 count 증가)
            count += n / 5;
            n /= 5;
        }

        System.out.println(count);
    }
}