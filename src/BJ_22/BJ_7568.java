// (몸무게, 키)를 2차원 배열로 받음
package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int[][] b = new int[a][2]; // (몸무게, 키)를 ax2 행렬로 받을 것

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            b[i][0] = Integer.parseInt(st.nextToken()); // 몸무게 입력
            b[i][1] = Integer.parseInt(st.nextToken()); // 키 입력
        }

        for (int i = 0; i < a; i++) { // 비교할 사람 1
            int rank = 1; // 초기 등수 1 초기화

            for (int j = 0; j < a; j++) { // 비교할 사람 2
                if (i == j) continue; // 동일인물 continue (즉, a-1번 반복 예정)

                if (b[i][0] < b[j][0] && b[i][1] < b[j][1]) {
                    rank++; // 자기보다 큰 덩치만 카운트해서 rank++
                }
            }

            sb.append(rank).append(" ");
        }

        System.out.println(sb);
    }
}

//// (몸무게, 키)를 1차원 배열로 각각 받음
//package BJ_22;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class BJ_7568 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int a = Integer.parseInt(br.readLine());
//        int[] b = new int[a]; // 몸무게 배열 선언
//        int[] c = new int[a]; // 키 배열 선언
//
//        for (int i = 0; i < a; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//
//            b[i] = Integer.parseInt(st.nextToken()); // 몸무게 입력
//            c[i] = Integer.parseInt(st.nextToken()); // 키 입력
//        }
//
//        for (int i = 0; i < a; i++) { // 비교할 사람 1
//            int rank = 1; // 등수 초기화
//
//            for (int j = 0; j < a; j++) { // 비교할 사람 2
//                if (i != j) { // 동일인물 패스 (continue)
//                    if (b[i] < b[j] && c[i] < c[j]) {
//                        rank++; // 자기보다 큰 덩치만 카운트해서 rank++
//                    }
//                }
//            }
//
//            sb.append(rank).append(" ");
//        }
//
//        System.out.println(sb);
//    }
//}