package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_9020 {
    public static boolean[] prime = new boolean[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        get_prime();

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(br.readLine());

            int c = b / 2;
            int d = b - c;

            while (true) {
                if (!prime[c] && !prime[d]) {
                    System.out.println(c + " " + d);
                    break;
                }
                else {
                    c--;
                    d++;
                }
            }
        }
    }

    public static void get_prime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i < Math.sqrt(prime.length); i++) {
            if (!prime[i]) {
                for (int j = i * i; j < prime.length; j += i) {
                    prime[j] = true;
                }
            }
        }
    }
}