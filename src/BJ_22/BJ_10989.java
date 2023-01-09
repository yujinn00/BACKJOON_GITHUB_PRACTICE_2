// 카운팅 정렬 : O(N)
package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int[] b = new int[10001];

        for (int i = 0; i < a; i++) {
            b[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 0; i < b.length; i++) {
            while (b[i] > 0) {
                sb.append(i).append("\n");
                b[i]--;
            }
        }

        System.out.println(sb);
    }
}