// 중복이 없는 경우의 정렬만 가능 => O(N)
package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        boolean[] b = new boolean[2000001];

        for (int i = 0; i < a; i++) {
            b[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < b.length; i++) {
            if (b[i]) {
                sb.append(i - 1000000).append('\n');
            }
        }

        System.out.println(sb);
    }
}

// // ArrayList, Collections.sort() 사용 => O(N log N)
// package BJ_22;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.ArrayList;
// import java.util.Collections;

// public class BJ_2751 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         int a = Integer.parseInt(br.readLine());

//         ArrayList<Integer> b = new ArrayList<>();

//         for (int i = 0; i < a; i++) {
//             b.add(Integer.parseInt(br.readLine()));
//         }

//         Collections.sort(b);

//         StringBuilder sb = new StringBuilder();

//         for (int c : b) {
//             sb.append(c).append('\n');
//         }

//         System.out.println(sb);
//     }
// }