// StringBuilder 사용 X
package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_4948 {
    public static boolean[] prime = new boolean[246913];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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
            System.out.println(count);
        }
    }

    public static void get_prime() {
        prime[0] = prime[1] = true; // true : 소수 X, false : 소수 O

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (!prime[i]) {
                for (int j = i + i; j <= prime.length; j += i) {
                    prime[j] = true;
                }
            }
        }
    }
}

// // StringBuilder 사용 O
// package BJ_22;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class BJ_4948 {
//     public static boolean[] prime = new boolean[246913];

//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         get_prime();

//         StringBuilder sb = new StringBuilder();

//         while (true) {
//             int a = Integer.parseInt(br.readLine());

//             if (a == 0) {
//                 break;
//             }

//             int count = 0;

//             for (int i = a + 1; i <= a + a; i++) {
//                 if (!prime[i]) {
//                     count++;
//                 }
//             }
//             sb.append(count).append('\n');
//         }
//         System.out.println(sb);
//     }

//     public static void get_prime() {
//         prime[0] = prime[1] = true; // true : 소수 X, false : 소수 O

//         for (int i = 2; i <= Math.sqrt(prime.length); i++) {
//             if (!prime[i]) {
//                 for (int j = i + i; j <= prime.length; j += i) {
//                     prime[j] = true;
//                 }
//             }
//         }
//     }
// }