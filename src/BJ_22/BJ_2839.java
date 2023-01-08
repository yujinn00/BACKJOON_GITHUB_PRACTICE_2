package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = 0;

        while (true) {
            if (a % 5 == 0) { // 5로 나누어 떨어지면 최소
                b += a / 5;
                System.out.println(b);
                break;
            } else { // 5로 나누어 떨어지지 않으면 3을 빼서 다시 반복
                a -= 3;
                b++;
            }

            if (a < 0) { // a < 3이 아닌 이유 : a가 0이 되었을 때도 생각해야 함
                System.out.println("-1");
                break;
            }
        }
    }
}