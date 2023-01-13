// 일반 재귀 함수 X => 시간 초과
// 반복문 활용 (int 타입 활용)
package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = 1, c = 1, sum = 1;

        if (a == 1 || a == 2) {
            System.out.println(sum);
        } else {
            for (int i = 3; i <= a; i++) {
                sum = b + c;
                b = c;
                c = sum;
            }

            System.out.println(sum);
        }
    }
}