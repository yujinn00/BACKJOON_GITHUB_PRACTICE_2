package BJ_23_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int dis = c - b;
            int max = (int) Math.sqrt(dis);

            if (max == Math.sqrt(dis)) {
                sb.append(2 * max - 1).append("\n");
            } else if (dis <= max * max + max) {
                sb.append(2 * max).append("\n");
            } else {
                sb.append(2 * max + 1).append("\n");
            }
        }

        System.out.println(sb);
    }
}
/*
(distance move      count max)
(1        1         1     1)
(2        11        2     1)
(3        111       3     1)
(4        121       3     2)
(5        1211      4     2)
(6        1221      4     2)
(7        12211     5     2)
(8        12221     5     2)
(9        12321     5     3)
(10       123211    6     3)
(11       123221    6     3)
(12       123321    6     3)
(13       1233211   7     3)
(14       1233221   7     3)
(15       1233321   7     3)
(16       1234321   7     4)
(17       12343211  8     4)
(18       12343221  8     4)
(19       12343321  8     4)
(20       12344321  8     4)
(21       123443211 9     4)
(22       123443221 9     4)
(23       123443321 9     4)
(24       123444321 9     4)
(25       123454321 9     5)
------------------------------
=> 구해야 하는 것 : count
------------------------------
(count distance max)
(1     1        1)
(2     2        1)
(3     4        2)
(4     6        2)
(5     9        3)
(6     12       3)
(7     16       4)
(8     20       4)
------------------------------
규칙 1 : max의 값은 distance의 제곱근에서 소수점을 버린 정수랑 같음
규칙 2 : max가 변하는 지점과 다음 지점 사이에는 항상 count가 두 번씩 변함
규칙 3 : distance의 제곱근이 정수로 딱 떨어지는 부분 다음에는 반드시 count가 변함
규칙 4 : max가 변할 때의 count는 (2 * max - 1)임
*/