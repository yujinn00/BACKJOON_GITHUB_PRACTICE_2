package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int sum = 0;
        int max = 10001;

        for (int i = a; i <= b; i++) {
            if (i == 1) {
                continue;
            }

            int count = 0;

            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count < 2) {
                sum += i;

                if (i < max) {
                    max = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println("-1");
        }
        else {
            System.out.println(sum);
            System.out.println(max);
        }
    }
}