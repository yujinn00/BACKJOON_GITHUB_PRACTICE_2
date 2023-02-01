package BJ_23_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11729 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        sb.append((int) (Math.pow(2, n) - 1)).append("\n"); // 일반항 : 2^n - 1

        hanoi(n, 1, 2, 3);
        System.out.println(sb);
    }

    public static void hanoi(int n, int a, int b, int c) { // 원판의 개수, 출발지, 경유지, 도착지
        if (n == 1) { // hanoi(1) : 이동할 원반의 개수가 1개 뿐이면 단순히 A에서 C로 이동
            sb.append(a).append(" ").append(c).append("\n");
            return;
        }

        hanoi(n - 1, a, c, b); // hanoi(n - 1) : A에 있는 n - 1개의 원판을 B로 이동
        sb.append(a).append(" ").append(c).append("\n"); // hanoi(1) : A의 최하단에 있는 1개의 원판을 C로 이동
        hanoi(n - 1, b, a, c); // hanoi(n - 1) : B에 있는 n - 1개의 원판을 C로 이동
    }
}