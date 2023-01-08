// toCharArray() 이용
package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] a = br.readLine().toCharArray();

        Arrays.sort(a);

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }
}

//// (문자 - '0' = 숫자) 성질 이용
//package BJ_22;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class BJ_1427 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String a = br.readLine();
//        int[] b = new int[10]; // 0부터 9까지의 정수 배열 생성
//
//        for (int i = 0; i < a.length(); i++) {
//            b[a.charAt(i) - '0']++; // 문자 - '0' = 숫자
//        }
//
//        for (int i = 9; i >= 0; i--) {
//            while (b[i]-- > 0) { // 반복을 한번 마치면 그때 --가 처리됨
//                System.out.print(i);
//            }
//        }
//    }
//}

//// 내가 짠 별로인 코드
//package BJ_22;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class BJ_1427 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int a = Integer.parseInt(br.readLine());
//        int b = 10;
//        int c;
//        int[] d = new int[10];
//        boolean e = false;
//
//        if (a < 10) {
//            System.out.println(a);
//            e = true;
//        }
//
//        do {
//            c = a % b;
//            a -= c;
//            b *= 10;
//
//            if (c >= 10) {
//                do {
//                    c /= 10;
//
//                } while (c > 9);
//            }
//
//            d[c]++;
//
//        } while (a != 0);
//
//        if (!e) {
//            for (int i = 9; i >= 0; i--) {
//                if (d[i] != 0) {
//                    System.out.print(i);
//                    d[i]--;
//                    i++;
//                }
//            }
//        }
//    }
//}