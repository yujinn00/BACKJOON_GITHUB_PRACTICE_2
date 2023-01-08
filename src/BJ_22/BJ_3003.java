package BJ_22;

import java.io.*;
import java.util.StringTokenizer;

public class BJ_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] piece = new int[6];

        for (int i = 0; i < piece.length; i++) {
            piece[i] = Integer.parseInt(st.nextToken());
        }

        sb.append(1 - piece[0]).append(" ");
        sb.append(1 - piece[1]).append(" ");
        sb.append(2 - piece[2]).append(" ");
        sb.append(2 - piece[3]).append(" ");
        sb.append(2 - piece[4]).append(" ");
        sb.append(8 - piece[5]);

        System.out.println(sb);
    }
}