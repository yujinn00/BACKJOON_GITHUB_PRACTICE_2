// 중복이 없는 경우의 정렬만 가능 => O(N)
package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        boolean[] b = new boolean[2000001]; // -1000000 ~ 1000000

        for (int i = 0; i < a; i++) {
            b[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        for (int i = 0; i < b.length; i++) {
            if (b[i]) {
                sb.append(i - 1000000).append("\n");
            }
        }

        System.out.println(sb);
    }
}

//// ArrayList, Collections.sort() 사용 => O(N log N)
//package BJ_22;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class BJ_2751 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int a = Integer.parseInt(br.readLine());
//        ArrayList<Integer> b = new ArrayList<>(); //  내장 함수 ~.sort()를 사용하려면 리스트를 사용해야 함
//
//        for (int i = 0; i < a; i++) {
//            b.add(Integer.parseInt(br.readLine()));
//        }
//
//        Collections.sort(b); // Arrays.sort()보다 더 빠름
//
//        for (int i = 0; i < a; i++) { // 일반적인 for 문 사용
//            sb.append(b.get(i)).append("\n");
//        }
//
////        for (int c : b) { // for-each 문 사용
////            sb.append(c).append("\n");
////        }
//
//        System.out.println(sb);
//    }
//}