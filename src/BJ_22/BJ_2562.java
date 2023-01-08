package BJ_22;

import java.io.*;

public class BJ_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0, max_index = 0;

        for (int i = 1; i < 10; i++) {
            int a = Integer.parseInt(br.readLine());

            if (max < a) {
                max = a;
                max_index = i;
            }
        }

        bw.write(max + "\n" + max_index);
        br.close();
        bw.flush();
        bw.close();
    }
}