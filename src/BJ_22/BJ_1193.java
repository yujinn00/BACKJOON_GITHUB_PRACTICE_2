// 구글링 참고 코드
package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 10000000; i++) {
            if (i >= a) {
                if (i % 2 == 0) {
                    System.out.println(a + "/" + (i - a + 1));
                } else {
                    System.out.println(i - a + 1 + "/" + a);
                }
                break;
            }
            a -= i;
        }
    }
}

/*
1   1/1	1층 1호   층-호+1 / 호

2   1/2	2층 1호   호 / 층-호+1
3   2/1	2층 2호   호 / 층-호+1

4   3/1	3층 1호   층-호+1 / 호
5   2/2	3층 2호   층-호+1 / 호
6   1/3	3층 3호   층-호+1 / 호

7   1/4	4층 1호   호 / 층-호+1
8   2/3	4층 2호   호 / 층-호+1
9   3/2	4층 3호   호 / 층-호+1
10  4/1	4층 4호   호 / 층-호+1

짝수 층 : 분모 +, 분자 -
홀수 층 : 분모 -, 분자 +
cf) 몇 층, 몇 호 구하는 것은 if 문과 a -= i를 이용하여 구함
 */

//// 내가 짠 별로인 코드
//package BJ_22;
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
//        int c = 1, d = 1, e = 1;
//
//        if (a == 1) {
//            System.out.println(c + "/" + d);
//        } else {
//            for (int i = 1; i < a; i++) {
//                if (i == e * (e + 1) / 2) { // 1 3 6 10
//                    if (e % 2 != 0) {
//                        d++;
//                    } else {
//                        c++;
//                    }
//                    e++;
//                } else {
//                    if (e % 2 == 0) {
//                        c++;
//                        d--;
//                    } else {
//                        c--;
//                        d++;
//                    }
//                }
//            }
//            System.out.println(c + "/" + d);
//        }
//    }
//}