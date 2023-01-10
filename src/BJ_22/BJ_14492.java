//package BJ_22;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class BJ_14492 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        int n = Integer.parseInt(br.readLine()); // 행렬 크기 입력
//        int[][] a = new int[n][n]; // 첫 번째 행렬 선언
//        int[][] b = new int[n][n]; // 두 번째 행렬 선언
//        int[][] c = new int[n][n]; // 부울곱된 행렬 선언
//        int count = 0; // 1의 개수를 0으로 초기화
//
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//
//            for (int j = 0; j < n; j++) {
//                a[i][j] = Integer.parseInt(st.nextToken()); // 첫 번째 행렬 입력
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//
//            for (int j = 0; j < n; j++) {
//                b[i][j] = Integer.parseInt(st.nextToken()); // 두 번째 행렬 입력
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                int sum = 0;
//
//                for (int k = 0; k < n; k++) {
//                    sum += a[i][k] * b[k][j];
//
//                    if (sum == 1) {
//                        c[i][j] = 1;
//                        break;
//                    }
//                }
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (c[i][j] == 1) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}

package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_14492 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); // 행렬 크기 입력
        int[][] a = new int[n][n]; // 첫 번째 행렬 선언
        int[][] b = new int[n][n]; // 두 번째 행렬 선언
        int[][] c = new int[n][n]; // 부울곱된 행렬 선언
        int count = 0; // 1의 개수를 0으로 초기화

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken()); // 첫 번째 행렬 입력
            }
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                b[i][j] = Integer.parseInt(st.nextToken()); // 두 번째 행렬 입력
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j]; // 부울곱

                    if (c[i][j] == 1) {
                        count++;
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }
}