/*
(abc : 입력한 수, M : 나눈 수, r : 나머지)
a / M + r
b / M + r
c / M + r

여기서 r은 모두 같으므로 r만 0으로 만들 수 있으면 M을 쉽게 구할 수 있음

(a / M + r) - (b / M + r) = (a - b) / M
(b / M + r) - (c / M + r) = (b - c) / M

M은 (a - b)와 (b - c)의 공약수라는 의미임
즉, (a - b)와 (b - c)의 공약수를 찾으면 그게 답임

여기서 참고할 점은 (a - b), (b - c)의 최대공약수 gcd를 구하고,
그 다음에 (b - c), (c - d)의 최대공약수를 구하면 안됨
모든 공약수가 같아야 한다는 점이기 때문에 (a - b), (b - c)에서 구해진
최대공약수 gcd는 (a - b), (b - c)의 공약수들 중 가장 큰 수인 것이고,
그 최대공약수 gcd와 (c - d)의 최대공약수를 구해야
(a - b), (b - c), (c - d)의 최대공약수가 되는 것임

여기서 잠깐, 왜 공약수가 아닌 최대공약수를 구하나 ?
최대공약수는 '공약수들 중에서 가장 큰 값'이므로
거꾸로 최대공약수를 찾고 그 최대공약수와 그의 약수들을 구하면 됨

결론 : 입력한 수의 뺄셈들의 최대공약수의 공약수를 구할 것 !!
*/
package BJ_23_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_2981 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int[] b = new int[a];

        for (int i = 0; i < a; i++) {
            b[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(b); // 오름차순 정렬 (정렬 대신 뺄셈한 값에 절댓값을 써도 가능)

        int gcd = b[1] - b[0]; // 처음 두 수의 뺄셈을 최대공약수의 초기값으로 설정

        for (int i = 2; i < a; i++) {
            gcd = GCD(gcd, b[i] - b[i - 1]); // 직전의 최대공약수와 다음 수(b[i] - b[i - 1])에 대한 최대공약수를 갱신
        }

        for (int i = 2; i <= gcd / 2; i++) { // 최대공약수의 약수들 찾기 (절반까지만 탐색)
            if (gcd % i == 0) { // i가 최대공약수의 약수일 때, 실행
                sb.append(i).append(" ");
            }
        }

        sb.append(gcd); // 절반까지만 탐색했으므로 마지막 최대공약수도 꼭 추가해야 함
        System.out.println(sb);
    }

    public static int GCD(int a, int b) { // 재귀보다 반복문이 조금 더 빠름
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        } return a;
    }
}