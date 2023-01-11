package BJ_22;

import java.io.*;
import java.util.*;

public class BJ_25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] c = new int[a];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < a; i++) {
            c[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(c);

        System.out.println(c[a - b]); // 커트라인 출력
    }
}