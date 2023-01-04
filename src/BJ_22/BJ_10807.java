package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int[] b = new int[a];
        int[] c = new int[201];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < a; i++) {
            b[i] = Integer.parseInt(st.nextToken()) + 100;
            c[b[i]]++;
        }

        int d = Integer.parseInt(br.readLine());

        System.out.println(c[d + 100]);
    }
}