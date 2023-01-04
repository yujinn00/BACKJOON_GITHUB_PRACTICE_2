// 내가 짠 별로인 코드
package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for (int i = 0;; i++) {
            if (a <= 1 + 6 * (i * (i + 1) / 2)) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}

// 구글링 참고 코드
// package BJ_22;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class BJ_2292 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int a = Integer.parseInt(br.readLine());
//        int layer = 1; // 겹 수 (최소 루트)
//        int number = 2; // 범위 (최솟값 기준)
//
//        if (a == 1) {
//            System.out.println(layer);
//        }
//        else {
//            while (number <= a) {
//                number += (6 * layer);
//                layer++;
//            }
//            System.out.println(layer);
//        }
//    }
//}