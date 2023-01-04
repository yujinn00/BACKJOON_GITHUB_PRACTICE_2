package BJ_22;

import java.io.*;
import java.util.StringTokenizer;

public class BJ_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int[] arr = new int[9];
        int max = 0;
        int max_index = 0;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());

            arr[i] = Integer.parseInt(st.nextToken());

            if (max < arr[i]) {
                max = arr[i];
                max_index = i + 1;
            }
        }

        bw.write(max + "\n" + max_index);
        br.close();
        bw.flush();
        bw.close();
    }
}