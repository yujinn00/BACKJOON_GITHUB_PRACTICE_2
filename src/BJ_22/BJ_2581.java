// 에라토스테네스의 체 활용
package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2581 {
    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int sum = 0, min = 10001;

        prime = new boolean[b + 1];
        get_prime();

        for (int i = a; i <= b; i++) {
            if (!prime[i]) {
                sum += i;

                if (min > i) {
                    min = i;
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
// 2751 ??