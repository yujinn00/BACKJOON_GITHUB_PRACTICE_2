package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int floor = Integer.parseInt(st.nextToken());
            int room = Integer.parseInt(st.nextToken()); // 사용하진 않음
            int guest = Integer.parseInt(st.nextToken());

            if (guest % floor == 0) {
                sb.append((floor * 100) + (guest / floor)).append("\n");
            } else {
                sb.append(((guest % floor) * 100) + (guest / floor) + 1).append("\n");
            }
        }

        System.out.println(sb);
    }
}