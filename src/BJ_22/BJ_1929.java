// O(N log(log N))
package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1929 {
    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        prime = new boolean[b + 1];
        get_prime();

        for (int i = a; i <= b; i++) {
            if (!prime[i]) {
                System.out.println(i);
            }
        }
    }

    public static void get_prime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (!prime[i]) {
                for (int j = i * i; j < prime.length; j += i) {
                    prime[j] = true;
                }
            }
        }
    }
}

// // O(N log(log N))
// package BJ_22;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.StringTokenizer;

// public class BJ_1929 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         StringTokenizer st = new StringTokenizer(br.readLine());

//         int a = Integer.parseInt(st.nextToken());
//         int b = Integer.parseInt(st.nextToken());

//         boolean[] c = new boolean[b + 1]; // 기본값 : false

//         c[0] = c[1] = true; // true : 소수 X, false : 소수

//         for (int i = 2; i <= Math.sqrt(b); i++){
//             if (!c[i]) {
//                 for(int j = i + i; j <= b ; j += i) {
//                     c[j] = true;
//                 }
//             }
//         }

//         for (int i = a; i <= b; i++) {
//             if (!c[i]) {
//                 System.out.println(i);
//             }
//         }
//     }
// }

// // O(N^(1/2))
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.StringTokenizer;

// public class BJ_1929 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         StringTokenizer st = new StringTokenizer(br.readLine());

//         int a = Integer.parseInt(st.nextToken());
//         int b = Integer.parseInt(st.nextToken());

//         for (int i = a; i <= b; i++) {
//             if (isPrimeNumber(i)) {
//                 System.out.println(i);
//             }
//         }
//     }

//     public static boolean isPrimeNumber(int a) {
//         if (a == 1) {
//             return false; // 소수 X
//         }

//         for (int i = 2; i <= Math.sqrt(a); i++) {
//             if (a % i == 0) {
//                 return false; // 소수 X
//             }
//         }
//         return true; // 소수 O
//     }
// }