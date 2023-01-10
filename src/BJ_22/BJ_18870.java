// for-each 사용 X
package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int[] b = new int[a]; // 입출력 정수 배열
        int[] c = new int[a]; // 정렬 정수 배열
        int d = 0; // 좌표 압축 값

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < a; i++) {
            b[i] = c[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(c);

        HashMap <Integer, Integer> map = new HashMap<>(); // 정수형 HashMap 선언

        for (int i = 0; i < a; i++) {
            if (!map.containsKey(c[i])) {
                map.put(c[i], d);
                d++;
            }
        }

        for (int i = 0; i < a; i++) {
            sb.append(map.get(b[i])).append(" ");
        }
        System.out.println(sb);
    }
}

//// for-each 사용 O
//package BJ_22;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.StringTokenizer;
//
//public class BJ_18870 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int a = Integer.parseInt(br.readLine());
//        int[] b = new int[a];
//        int[] c = new int[a];
//        int d = 0;
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        for (int i = 0; i < a; i++) {
//            b[i] = c[i] = Integer.parseInt(st.nextToken());
//        }
//
//        Arrays.sort(c);
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int e : c) {
//            if (!map.containsKey(e)) {
//                map.put(e, d);
//                d++;
//            }
//        }
//
//        for (int f : b) {
//            sb.append(map.get(f)).append(" ");
//        }
//
//        System.out.println(sb);
//    }
//}