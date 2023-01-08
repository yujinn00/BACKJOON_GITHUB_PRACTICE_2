package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] c = new int[a];
        int sum, sum_max = 0;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < a; i++) {
            c[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < a - 2; i++) {
            if (c[i] <= b) {
                for (int j = i + 1; j < a - 1; j++) {
                    if (c[i] + c[j] <= b) {
                        for (int k = j + 1; k < a; k++) {
                            sum = c[i] + c[j] + c[k];

                            if (sum_max < sum && sum <= b) {
                                sum_max = sum;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(sum_max);
    }
}