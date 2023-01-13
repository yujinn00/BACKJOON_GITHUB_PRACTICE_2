//// 일반 재귀 함수 X => 시간 초과
//// 반복문 활용 (long 타입 활용)
//package BJ_22;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//
//public class BJ_2748 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        long a = Integer.parseInt(br.readLine());
//        long b = 1, c = 1, sum = 1;
//
//        if (a == 1 || a == 2) {
//            System.out.println(sum);
//        } else {
//            for (int i = 3; i <= a; i++) {
//                sum = b + c;
//                b = c;
//                c = sum;
//            }
//
//            System.out.println(sum);
//        }
//    }
//}

// DP 활용 (DP : 어떤 문제를 작은 문제로 쪼개서 풀어나감에 있어 반복되는 호출을 줄이는 알고리즘)
package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2748 {
    public static long[] f = new long[91];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        f[1] = f[2] = 1;

        System.out.println(fib(Integer.parseInt(br.readLine())));
    }

    public static long fib(int n) {
        if (n > 2) {
            if (f[n] == 0) { // f[n]의 값이 기본값이면 실행
                f[n] = fib(n - 1) + fib(n - 2); // 이미 계산한 적이 있으면 또 다시 계산하는 것이 아닌 해당 값을 재활용하여 시간을 단축
            }

        }
        return f[n];
    }
}