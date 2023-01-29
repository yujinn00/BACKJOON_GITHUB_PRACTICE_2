// 카운팅 정렬 활용
package BJ_23_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 입력할 수의 개수
        int[] num = new int[8001]; // 입력값의 범위 (-4000 ~ 4000)
        int sum = 0, min = 4001, max = -4001; // 합계, 최솟값, 최댓값
        int median = 0, mode = 0; // 중앙값, 최빈값

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());
            sum += value; // 평균값을 구하기 위한 합계 구하기
            num[value + 4000]++;

            if (max < value) { // 범위값을 구하기 위한 최댓값 구하기
                max = value;
            }

            if (min > value) { // 범위값을 구하기 위한 최솟값 구하기
                min = value;
            }
        }

        int count = 0; // 중앙값을 구하기 위한 빈도 누적 횟수
        int mode_max = 0; // 최빈값의 최댓값
        boolean flag = false; // 이전과 동일한 최빈값이 1번만 등장했으면 true, 아니면 false

        for (int i = min + 4000; i <= max + 4000; i++) {
            if (num[i] > 0) {
                if (count < (n + 1) / 2) { // 빈도 누적 횟수가 전체 길이의 절반에 못 미치면 실행
                    count += num[i]; // i 값의 빈도수를 count에 누적
                    median = i - 4000; // 중앙값 구하기
                }

                if (mode_max < num[i]) { // 이전 최빈값의 최댓값보다 현재 값의 빈도수가 더 높으면 실행
                    mode_max = num[i];
                    flag = true; // 첫 등장이므로 true로 변경
                    mode = i - 4000; // 최빈값이 하나뿐일 때, 최빈값 구하기
                } else if (mode_max == num[i] && flag) { // 이전 최빈값의 최댓값과 동일한 경우면서 한 번만 중복되면 실행 (한 번만 중복 == 두 번째로 작은 값)
                    flag = false; // 두 번의 중복이 되었으므로 다시 처음의 값인 false로 변경
                    mode = i - 4000; // 최빈값이 둘 이상일 때, 두 번째 최빈값 구하기
                }
            }
        }

        System.out.println(Math.round((double) sum / n)); // 평균값 (소수점 이하 첫째 자리에서 반올림한 값 => String.format() 함수가 아닌 Math.round() 함수를 활용해야 함)
        System.out.println(median); // 중앙값
        System.out.println(mode); // 최빈값 (여러 개 있을 때에는 최빈값 중 두 번째로 작은 값)
        System.out.println(max - min); // 범위값
    }
}