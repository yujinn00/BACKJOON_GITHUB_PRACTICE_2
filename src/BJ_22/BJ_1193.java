// 내가 짠 별로인 코드
package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int c = 1, d = 1, e = 1;

        if (a == 1) {
            System.out.println(c + "/" + d);
        }
        else {
            for (int i = 1; i < a; i++) {
                if (i == e * (e + 1) / 2) { // 1 3 6 10
                    if (e % 2 != 0) {
                        d++;
                    }
                    else {
                        c++;
                    }
                    e++;
                }
                else {
                    if (e % 2 == 0) {
                        c++;
                        d--;
                    }
                    else {
                        c--;
                        d++;
                    }
                }
            }
            System.out.println(c + "/" + d);
        }
    }
}

//// 구글링 참고 코드
// package BJ_22;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class BJ_1193 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int a = Integer.parseInt(br.readLine());
//
//        for(int i = 1; i <= 10_000_000; i++) {
//            if(i >= a) {
//                if(i % 2 == 0) {
//                    System.out.println(a + "/" + (i - a + 1));
//                }
//                else {
//                    System.out.println(i - a + 1 + "/" + a);
//                }
//                break;
//            }
//            a -= i;
//        }
//    }
//}