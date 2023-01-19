/*
기본 베이스는 분할 정복 알고리즘이며, 출력으로 인한 시간 초과가 뜬다.
다시 말해 sout을 사용하면 시간 초과가 뜨므로
StringBuilder, BufferedWriter 중 하나를 선택하여 활용하면 되는데
BufferedWriter가 더 효율적이므로 이것을 사용하였다.
*/
package BJ_23_01;

import java.io.*;

public class BJ_2447 {
    public static char[][] star;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        star = new char[n][n];

        get_star(0, 0, n, false);

        for (int i = 0; i < n; i++) {
            bw.write(star[i]); // star[i][j]로 하나씩 출력할 필요 없이 star[i]를 출력하면 그 행 전체가 출력됨
            bw.write("\n"); // bw.write()는 .으로 이어지지 않음
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void get_star(int a, int b, int n, boolean blank) {
        if (blank) { // 공백 칸일 때, 공백으로 채우기
            for (int i = a; i < a + n; i++) {
                for (int j = b; j < b + n; j++) {
                    star[i][j] = ' ';
                }
            } return; // star[][]를 공백으로 채웠으니 다시 이중 반복문으로 돌아가기 위함
        }

        if (n == 1) { // size가 1일 때, *로 채우기
            star[a][b] = '*';
            return; // star[][]를 *로 채웠으니 다시 이중 반복문으로 돌아가기 위함
        }

        int size = n / 3;
        int count = 0;

        for (int i = a; i < a + n; i += size) { // 블록 단위로 공백을 판별하기 위한 2중 반복문
            for (int j = b; j < b + n; j += size) {
                count++;
                get_star(i, j, size, count == 5); // (count == 5) => (공백 칸) // blank => 공백 칸이면 true, 아니면 false
            }
        }
    }
}