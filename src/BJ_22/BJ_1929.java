// O(N log(log N)) // 거의 모든 수를 판별할 때 빠름 (사용자 지정 함수 활용)
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

        for (int i = 2; i <= Math.sqrt(prime.length - 1); i++) { // 아마 이것도 아래와 마찬가지로 <=하면 될 듯 ..? (★)
            if (!prime[i]) {
                for (int j = i * i; j <= prime.length - 1; j += i) { // b까지 반복해야 하므로 조건식이 <가 아닌 <=임 (★)
                    prime[j] = true;
                }
            }
        }
    }
}

//// O(N log(log N)) // 거의 모든 수를 판별할 때 빠름 (main 메소드만 활용)
//package BJ_22;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class BJ_1929 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//
//        boolean[] prime = new boolean[b + 1]; // 기본값 : false
//
//        prime[0] = prime[1] = true; // true : 소수 X, false : 소수
//
//        for (int i = 2; i <= Math.sqrt(b); i++){ // 아마 이것도 아래와 마찬가지로 <=하면 될 듯 ..? (★)
//            if (!prime[i]) {
//                for (int j = i * i; j <= b ; j += i) { // b까지 반복해야 하므로 조건식이 <가 아닌 <=임 (★)
//                    prime[j] = true;
//                }
//            }
//        }
//
//        for (int i = a; i <= b; i++) {
//            if (!prime[i]) {
//                System.out.println(i);
//            }
//        }
//    }
//}

//// O(N^(1/2)) // 거의 모든 수를 판별할 때 느림
//package BJ_22;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class BJ_1929 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//
//        for (int i = a; i <= b; i++) {
//            if (isPrimeNumber(i)) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    public static boolean isPrimeNumber(int a) { // 소수 체크 함수
//        if (a == 1) {
//            return false; // 소수 X
//        }
//
//        for (int i = 2; i <= Math.sqrt(a); i++) {
//            if (a % i == 0) {
//                return false; // 소수 X
//            }
//        }
//
//        return true; // 소수 O
//    }
//}