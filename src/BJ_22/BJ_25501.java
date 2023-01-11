package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_25501 {
    public static int count = 0;

    public static int recursion(String s, int l, int r) {
        count++;
        if (l >= r) return 1; // 글자 수가 1인 경우, 팰린드롬 검사를 다 마친 경우 => 1 반환
        else if (s.charAt(l) != s.charAt(r)) return 0; // 팰린드롬이 아닌 경우 => 0 반환
        else return recursion(s, l + 1, r - 1); // 팰린드롬이 맞는 경우 => 인덱스를 좁혀서 다시 검사 => 재귀 함수 호출
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1); // 팰린드롬 검사 재귀 함수 호출
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            sb.append(isPalindrome(br.readLine())).append(" ").append(count).append("\n");
            count = 0;
        }

        System.out.println(sb);
    }
}