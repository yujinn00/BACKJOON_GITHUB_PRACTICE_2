/*
동서에서의 최대 길이와 남북에서의 최대 길이로 최대 면적을 구하고,
각 최대 길이의 양 옆 길이를 빼서 구한 빈 면적의 길이로 빈 면적을 구하고,
Math.abs() 함수를 활용한 (최대 면적 - |빈 면적|)을 통해 참외밭 면적을 구하고,
(참외밭 총 면적 * 제곱미터 당 자라는 참외의 개수)를 통해 답을 구한다.
*/
package BJ_23_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2477 {
    public static int n; // 참외의 개수 선언
    public static int[] dir = new int[6]; // 방향 선언
    public static int[] len = new int[6]; // 길이 선언
    public static int max1, max2, sub1, sub2; // 최대 길이 및 빈 면적의 길이 선언 (최대 면적 - 빈 면적)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine()); // 참외의 개수 입력

        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            dir[i] = Integer.parseInt(st.nextToken()); // 방향 입력
            len[i] = Integer.parseInt(st.nextToken()); // 길이 입력
        }

        for (int i = 0; i < 6; i++) {
            if (dir[i] == 1 || dir[i] == 2) { // 동쪽 및 서쪽이면 실행
                if (max1 < len[i]) { // 최대 길이 구하기
                    max1 = len[i];

                    if (i == 0) { // 빈 면적의 길이 구하기
                        sub1 = len[5] - len[i + 1];
                    } else if (i == 5) {
                        sub1 = len[i - 1] - len[0];
                    } else {
                        sub1 = len[i - 1] - len[i + 1];
                    }
                }
            } else { // 남쪽 및 북쪽이면 실행
                if (max2 < len[i]) { // 최대 길이 구하기
                    max2 = len[i];

                    if (i == 0) { // 빈 면적의 길이 구하기
                        sub2 = len[5] - len[i + 1];
                    } else if (i == 5) {
                        sub2 = len[i - 1] - len[0];
                    } else {
                        sub2 = len[i - 1] - len[i + 1];
                    }
                }
            }
        }

        System.out.println((max1 * max2 - Math.abs(sub1 * sub2)) * n); // 참외밭 총 면적 * 제곱미터 당 자라는 참외의 개수 // 참외밭 총 면적 = 최대 면적 - 빈 면적 // Math.abs() 함수를 활용하여 빈 면적에 절댓값을 취함
    }
}