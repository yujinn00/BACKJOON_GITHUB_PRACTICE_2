package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        boolean b = false;

        for (int i = 1; i <= 1000000; i++) {
            if (a == dec_sum(i)) {
                System.out.println(i);
                b = true;
                break;
            }
        }

        if (!b) {
            System.out.println("0");
        }
    }

    public static int dec_sum(int a) { // 분해합 구하는 함수
        int sum = a;

        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }

        return sum;
    }
}