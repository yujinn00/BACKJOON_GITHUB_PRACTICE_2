// Comparator 사용
package BJ_22;

import java.io.*;
import java.util.*;

public class BJ_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int[][] b = new int[a][2];

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            b[i][0] = Integer.parseInt(st.nextToken());
            b[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(b, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) { // x 좌표가 같을 경우, y 좌표를 비교해서 정렬함
                    return o1[1] - o2[1]; // return 값이 양수면 위치를 바꾸지 않고, 음수면 위치를 바꿈 (뺄셈의 의미가 아님)
                }
                else { // x 좌표가 다를 경우, x 좌표를 비교해서 정렬함
                    return o1[0] - o2[0]; // return 값이 양수면 위치를 바꾸지 않고, 음수면 위치를 바꿈 (뺄셈의 의미가 아님)
                }
            }
        });

        for (int i = 0; i < a; i++) {
            sb.append(b[i][0]).append(" ").append(b[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}

// // lambda 사용
// package BJ_22;

// import java.io.*;
// import java.util.*;

// public class BJ_11650 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuilder sb = new StringBuilder();

//         int a = Integer.parseInt(br.readLine());
//         int[][] b = new int[a][2];

//         for (int i = 0; i < a; i++) {
//             StringTokenizer st = new StringTokenizer(br.readLine());

//             b[i][0] = Integer.parseInt(st.nextToken());
//             b[i][1] = Integer.parseInt(st.nextToken());
//         }

//         Arrays.sort(b, (o1, o2) -> (o1[0] == o2[0]) ? o1[1] - o2[1] : o1[0] - o2[0]);

//         for (int i = 0; i < a; i++) {
//             sb.append(b[i][0]).append(" ").append(b[i][1]).append("\n");
//         }

//         System.out.println(sb);
//     }
// }