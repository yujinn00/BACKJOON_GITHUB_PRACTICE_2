// 그리디 알고리즘
package BJ_23_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] dist = new long[n - 1];
        long[] cost = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n - 1; i++) {
            dist[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            cost[i] = Long.parseLong(st.nextToken());
        }

        long minCost = 1000000001;
        long sum = 0;

        for (int i = 0; i < n - 1; i++) { // 비용이 (5 2 4 1)이면 (5 2 2 1)로 바꿔 계산하는 반복문
            if (cost[i] < minCost) {
                minCost = cost[i];
            }

            sum += (minCost * dist[i]);
        }

        System.out.println(sum);
    }
}