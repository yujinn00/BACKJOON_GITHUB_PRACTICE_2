package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] a = new int[31];

        for (int i = 0; i < 28; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            a[Integer.parseInt(st.nextToken())]++;
        }

        for (int i = 1; i <= 30; i++) {
            if (a[i] != 1) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}