package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_9020 {
    public static boolean[] prime = new boolean[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        get_prime();

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(br.readLine());
            // b의 중앙인 수로부터 1씩 멀어질 것
            int c = b / 2;
            int d = b - c;

            while (true) {
                if (!prime[c] && !prime[d]) {
                    sb.append(c).append(" ").append(d).append("\n");
                    break;
                } else {
                    c--;
                    d++;
                }
            }
        }

        System.out.println(sb);
    }

    public static void get_prime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length - 1); i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= prime.length - 1; j += i) {
                    prime[j] = true;
                }
            }
        }
    }
}