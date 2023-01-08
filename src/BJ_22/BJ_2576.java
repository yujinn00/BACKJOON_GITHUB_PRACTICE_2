package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0, min = 100;

        for (int i = 0; i < 7; i++) {
            int a = Integer.parseInt(br.readLine());

            if (a % 2 != 0) {
                sum += a;

                if (min > a) {
                    min = a;
                }
            }
        }

        if (sum == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}