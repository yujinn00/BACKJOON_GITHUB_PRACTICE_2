//package BJ_23_01;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//
//public class BJ_2981 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder(br.readLine());
//
//        int a = Integer.parseInt(br.readLine());
//        int[] b = new int[a];
//
//        for (int i = 0; i < a; i++) {
//            b[i] = Integer.parseInt(br.readLine());
//        }
//
//        Arrays.sort(b); // 정렬
//
//        int gcdVal = b[1] - b[0]; // 음수가 되지 않도록 큰 수에서 작은 수로 빼기
//
//        for (int i = 2; i < a; i++) { // 직전의 최대공약수와 다음 수(b[i] - b[i - 1])의 최대공약수를 갱신
//            gcdVal = GCD(gcdVal, b[i] - b[i - 1]);
//        }
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 2; i <= Math.sqrt(gcdVal); i++) { // 최대공약수의 약수들 찾기 (제곱근까지만 탐색)
//            if (i * i == gcdVal) { // 제곱근이 gcdVal의 약수라면 중복 추가를 방지하기 위해 한 번만 추가
//                list.add(i);
//            } else if (gcdVal % i == 0) { // i가 최대공약수의 약수라면 i와 나눈 몫 추가
//                list.add(i);
//                list.add(gcdVal / i);
//            }
//        }
//
//        Collections.sort(list); // 정렬
//
//        for (int val : list) {
//            sb.append(val).append(" ");
//        }
//
//        sb.append(gcdVal); // 제곱근까지만 탐색했으므로 마지막 최대공약수도 꼭 출력해야 함
//        System.out.println(sb);
//    }
//
//    public static int GCD(int a, int b) {
//        if (b == 0) {
//            return a;
//        } else {
//            return GCD(b, a % b);
//        }
//    }
//}

package BJ_23_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_2981 {
    public static int GCD(int num1, int num2) {
        while (num2 != 0) {
            int tmp = num1 % num2;
            num1 = num2;
            num2 = tmp;
        }

        return num1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i]-=arr[i-1];
        }

        int gcd = arr[1];
        for (int i = 2; i < size; i++) {
            gcd = GCD(gcd, arr[i]);
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 2; i <= gcd; i++) {
            if(gcd%i==0) sb.append(i).append(' ');
        }

        System.out.println(sb.toString().strip());
    }
}