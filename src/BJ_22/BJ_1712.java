// 일일이 계산하여 비교하면 정수 범위도 벗어나고, 시간도 초과될 수 있으므로 아래와 같이 해결해야 함
package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] a = new int[3];

        for (int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        if (a[1] >= a[2]) {
            System.out.println("-1");
        } else {
            System.out.println(a[0] / (a[2] - a[1]) + 1);
        }
    }
}