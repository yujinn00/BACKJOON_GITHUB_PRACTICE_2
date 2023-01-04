package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = 0;

        while (true) {
            if (a % 5 == 0) {
                b += a / 5;
                System.out.println(b);
                break;
            } else {
                a -= 3;
                b++;
            }

            if (a < 0) {
                System.out.println("-1");
                break;
            }
        }
    }
}