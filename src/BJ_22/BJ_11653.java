// 2부터 a를 계속 나눠주기만 하면 2의 배수로는 당연히 나눠지지 않기 때문에 굳이 소수를 판별할 필요가 없음
// 즉, 에라토스테네스의 체를 활용하면 더 느림
package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int b = 2; // 소인수 초기화

        while (a != 1) {
            if (a % b == 0) {
                a /= b;
                sb.append(b).append("\n");
            } else {
                b++;
            }
        }

        System.out.println(sb);
    }
}