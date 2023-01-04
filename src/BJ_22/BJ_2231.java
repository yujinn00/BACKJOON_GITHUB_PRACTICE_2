package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = 0;

        for (int i = 1; i <= 1000000; i++) {
            if (a == dec_sum(i)) {
                System.out.println(i);
                b++;
                break;
            }
        }

        if (b == 0) {
            System.out.println("0");
        }
    }

    public static int dec_sum(int a) {
        int sum = a;

        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }

        return sum;
    }
}