// Comporator 사용
package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BJ_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int[][] b = new int[a][2];

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            b[i][0] = Integer.parseInt(st.nextToken()); // x 좌표 입력
            b[i][1] = Integer.parseInt(st.nextToken()); // y 좌표 입력
        }

        Arrays.sort(b, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
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

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Arrays;
// import java.util.StringTokenizer;

// public class BJ_11651 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuilder sb = new StringBuilder();

//         int a = Integer.parseInt(br.readLine());
//         int[][] b = new int[a][2];

//         for (int i = 0; i < a; i++) {
//             StringTokenizer st = new StringTokenizer(br.readLine());

//             b[i][0] = Integer.parseInt(st.nextToken()); // x 좌표 입력
//             b[i][1] = Integer.parseInt(st.nextToken()); // y 좌표 입력
//         }

//         Arrays.sort(b, ((o1, o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1]));

//         for (int i = 0; i < a; i++) {
//             sb.append(b[i][0]).append(" ").append(b[i][1]).append("\n");
//         }

//         System.out.println(sb);
//     }
// }