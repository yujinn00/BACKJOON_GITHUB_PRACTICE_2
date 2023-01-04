// 내가 짠 별로인 소스
package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] c = new int[a];
        int sum = 0;
        int min = 300001;
        int print = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < a; i++) {
            c[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i != j) {
                    for (int k = 0; k < a; k++) {
                        if (j != k && k != i) {
                            sum = c[i] + c[j] + c[k];

                            if (sum > b) {
                                continue;
                            }

                            if (min > b - sum) {
                                min = b - sum;
                                print = sum;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(print);
    }
}

// // 반복문을 수정한 소스
// package BJ_22;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.StringTokenizer;

// public class BJ_2798 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine());

//         int a = Integer.parseInt(st.nextToken());
//         int b = Integer.parseInt(st.nextToken());
//         int[] c = new int[a];
//         int sum;
//         int result = 0;

//         st = new StringTokenizer(br.readLine());

//         for (int i = 0; i < a; i++) {
//             c[i] = Integer.parseInt(st.nextToken());
//         }

//         // 3개를 고르기 때문에 첫 번째 카드는 a - 2까지만 순회
//         for (int i = 0; i < a - 2; i++) {
//             // 두 번째 카드는 첫 번째 카드 다음부터 a - 1까지만 순회
//             for (int j = i + 1; j < a - 1; j++) {
//                 // 세 번째 카드는 두 번째 카드 다음부터 a까지 순회
//                 for (int k = j + 1; k < a; k++) {
//                     sum = c[i] + c[j] + c[k];

//                     if (result < sum && sum <= b) {
//                         result = sum;
//                     }
//                 }
//             }
//         }
//         System.out.println(result);
//     }
// }

// // 수정한 반복문에 조건문을 추가한 소스
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.StringTokenizer;

// public class BJ_2798 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine());

//         int a = Integer.parseInt(st.nextToken());
//         int b = Integer.parseInt(st.nextToken());
//         int[] c = new int[a];
//         int sum;
//         int result = 0;

//         st = new StringTokenizer(br.readLine());

//         for (int i = 0; i < a; i++) {
//             c[i] = Integer.parseInt(st.nextToken());
//         }

//         // 3개를 고르기 때문에 첫 번째 카드는 a - 2까지만 순회
//         for (int i = 0; i < a - 2; i++) {
//             // 첫 번째 카드가 b보다 크면 continue
//             if (c[i] > b) {
//                 continue;
//             }
//             // 두 번째 카드는 첫 번째 카드 다음부터 a - 1까지만 순회
//             for (int j = i + 1; j < a - 1; j++) {
//                 // 첫 번째 카드와 두 번째 카드의 합이 b보다 크면 continue
//                 if (c[i] + c[j] > b) {
//                     continue;
//                 }
//                 // 세 번째 카드는 두 번째 카드 다음부터 a까지 순회
//                 for (int k = j + 1; k < a; k++) {
//                     sum = c[i] + c[j] + c[k];

//                     if (result < sum && sum <= b) {
//                         result = sum;
//                     }
//                 }
//             }
//         }
//         System.out.println(result);
//     }
// }