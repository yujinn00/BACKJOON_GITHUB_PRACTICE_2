package BJ_22;

import java.io.*;
import java.util.StringTokenizer;

public class BJ_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] piece = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 6; i++) {
            piece[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(1 - piece[0] + " ");
        bw.write(1 - piece[1] + " ");
        bw.write(2 - piece[2] + " ");
        bw.write(2 - piece[3] + " ");
        bw.write(2 - piece[4] + " ");
        bw.write(8 - piece[5] + " ");

        br.close();
        bw.flush();
        bw.close();
    }
}