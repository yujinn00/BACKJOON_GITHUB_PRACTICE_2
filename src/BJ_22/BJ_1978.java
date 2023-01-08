// 에라토스테네스의 체 활용
package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1978 {
    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;

        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(st.nextToken());

            prime = new boolean[b + 1];
            get_prime();

            if (!prime[b]) {
                count++;
            }
        }

        System.out.println(count);
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

//// 내가 짠 별로인 코드
//package BJ_22;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class BJ_1978 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int a = Integer.parseInt(br.readLine());
//        int count_i = a;
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        for (int i = 0; i < a; i++) {
//            int b = Integer.parseInt(st.nextToken());
//
//            if (b == 1) {
//                count_i--;
//                continue;
//            }
//
//            int count_j = 0;
//
//            for (int j = 1; j <= b; j++) {
//                if (b % j == 0) {
//                    count_j++;
//                }
//                if (count_j > 2) {
//                    count_i--;
//                    break;
//                }
//            }
//        }
//        System.out.println(count_i);
//    }
//}