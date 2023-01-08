package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int count = a;

        for (int i = 0; i < a; i++) {
            String b = br.readLine();
            int[] alpha = new int[26]; // 알파벳 배열 생성
            alpha[b.charAt(0) - 'a']++;

            for (int j = 1; j < b.length(); j++) {
                if (b.charAt(j) != b.charAt(j - 1)) {
                    if (++alpha[b.charAt(j) - 'a'] > 1) {
                        count--;
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }
}