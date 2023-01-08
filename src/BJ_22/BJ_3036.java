package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int[] b = new int[a];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < a; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < a; i++) {
            sb.append(b[0] / GCD(b[0], b[i])).append("/").append(b[i] / GCD(b[0], b[i])).append("\n");
        }

        System.out.println(sb);
    }
    // 기약 분수를 출력하기 위해서는 최대공약수를 활용해야 함
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}