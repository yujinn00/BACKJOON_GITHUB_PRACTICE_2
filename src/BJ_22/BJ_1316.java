package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int d = a;

        StringTokenizer st;

        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine());

            String b = st.nextToken(); // 문자 하나 입력받기

            int c = (int) (b.charAt(0) - 'a');

            int[] arr = new int[26]; // 알파벳 배열 생성

            arr[c]++; // 알파벳 배열의 인덱스 c를 1 증가

            for (int j = 1; j < b.length(); j++) {
                if (b.charAt(j) == b.charAt(j - 1)) {
                    continue;
                }
                else {
                    arr[(int) (b.charAt(j) - 'a')]++;

                    if (arr[(int) (b.charAt(j) - 'a')] == 2) {
                        d--;
                        break;
                    }
                }
            }
        }
        System.out.println(d);
    }
}