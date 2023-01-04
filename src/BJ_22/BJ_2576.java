package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] a = new int[7];
        int[] b = new int[7];
        int count = 0;

        for (int i = 0; i < 7; i++) {
            a[i] = Integer.parseInt(br.readLine());

            if (a[i] % 2 == 1) {
                b[count] = a[i];
                count++;
            }
        }

        if (count == 0) {
            sb.append("-1");
        } else {
            int sum = 0;
            int min = 100;

            for (int i = 0; i < count; i++) {
                sum += b[i];

                if (min > b[i]) {
                    min = b[i];
                }
            }
            sb.append(sum).append("\n").append(min);
        }
        System.out.println(sb);
    }
}