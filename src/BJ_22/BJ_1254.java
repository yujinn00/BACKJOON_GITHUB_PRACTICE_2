// 구글링 참고 코드 1 (toCharArray() 이용)
package BJ_22;

import java.io.*;

public class BJ_1254 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int left = 0;
        int right = str.length() - 1;

        while (true) {
            if (!isPalindrome(left, right, str.toCharArray())) {
                left++;
            } else {
                System.out.println(left + str.length());
                break;
            }
        }
    }

    public static boolean isPalindrome(int left, int right, char[] arr) { // 팰린드롬 체크 함수
        while (left < right) {
            if (arr[left] == arr[right]) {
                left++;
                right--;
            } else {
                break;
            }
        }

        return left >= right;
    }
}

//// 구글링 참고 코드 2 (StringBuilder() 이용)
//package BJ_22;
//
//import java.io.*;
//
//public class BJ_1254 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String a = br.readLine();
//
//        if (a.equals(new StringBuilder(a).reverse().toString())) {
//            System.out.println(a.length());
//        } else {
//            for (int i = 1; i < a.length(); i++) {
//                StringBuilder sb = new StringBuilder(a);
//
//                sb.append(new StringBuilder(a.substring(0, i)).reverse());
//
//                if (sb.toString().equals(sb.reverse().toString())) {
//                    System.out.println(sb.length());
//                    break;
//                }
//            }
//        }
//    }
//}