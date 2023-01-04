package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            sb.append(LCM(b, c)).append("\n");
        }

        System.out.println(sb);
    }

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            return GCD(b, a % b);
        }
    }

    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }
}