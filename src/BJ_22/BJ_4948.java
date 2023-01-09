package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_4948 {
    public static boolean[] prime = new boolean[246913];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        get_prime();

        while (true) {
            int a = Integer.parseInt(br.readLine());

            if (a == 0) {
                break;
            }

            int count = 0;

            for (int i = a + 1; i <= a + a; i++) {
                if (!prime[i]) {
                    count++;
                }
            }

            sb.append(count).append("\n");
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

/*
get_prime() 함수에서 첫 번째 for 문 조건식은
i * i <= prime.length - 1
i <= Math.sqrt(prime.length - 1)
위의 두 코드 중 아무거나 써도 상관없음
*/