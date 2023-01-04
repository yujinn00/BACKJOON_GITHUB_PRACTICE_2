package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int floor = Integer.parseInt(st.nextToken());
            int guest = Integer.parseInt(st.nextToken());

            if (guest % floor == 0) {
                System.out.println(floor * 100 + guest / floor);
            } else {
                System.out.println(guest % floor * 100 + guest / floor + 1);
            }
        }
    }
}