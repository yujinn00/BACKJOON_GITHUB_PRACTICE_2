package BJ_22;

import java.io.*;
import java.util.StringTokenizer;

public class BJ_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < b; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            sum += c * d;
        }

        if (a == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}