// 구글링 참고 코드
package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int layer = 1; // 벌집 겹 수 (최소 경로인 1부터 시작)
        int range = 2; // 벌집 개수 범위 (1을 제외한 최솟값인 2부터 시작)

        if (a == 1) {
            System.out.println(layer);
        } else {
            while (range <= a) { // 범위가 값을 초과할 때까지 반복
                range += (6 * layer); // 8 20 38 62 ~
                layer++; // 2 3 4 5 ~
            }
            System.out.println(layer);
        }
    }
}

/*
N       벌집 겹
1       1   1
2~7     6   2
8~19    12  3
20~37   18  4
38~61   24  5
cf) 6 단위 증가
*/

//// 내가 짠 별로인 코드
//package BJ_22;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class BJ_2292 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int a = Integer.parseInt(br.readLine());
//
//        for (int i = 0;; i++) {
//            if (a <= 1 + 6 * (i * (i + 1) / 2)) {
//                System.out.println(i + 1);
//                break;
//            }
//        }
//    }
//}