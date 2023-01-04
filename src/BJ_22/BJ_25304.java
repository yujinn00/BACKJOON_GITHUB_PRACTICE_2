package BJ_22;

import java.io.*;
import java.util.StringTokenizer;

public class BJ_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int[] c = new int[b];
        int[] d = new int[b];
        int sum = 0;

        StringTokenizer st;

        for (int i = 0; i < b; i++) {
            st = new StringTokenizer(br.readLine());

            c[i] = Integer.parseInt(st.nextToken());
            d[i] = Integer.parseInt(st.nextToken());

            sum += c[i] * d[i];
        }

        if (sum == a) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}