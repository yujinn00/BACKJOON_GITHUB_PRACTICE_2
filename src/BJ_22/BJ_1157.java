// 구글링 참고 코드
package BJ_22;

import java.io.*;

public class BJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int[] alpha = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                alpha[s.charAt(i) - 97]++;
            } else {
                alpha[s.charAt(i) - 65]++;
            }
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (max < alpha[i]) {
                max = alpha[i];
                ch = (char) (i + 65);
            } else if (max == alpha[i]) {
                ch = '?';
            }
        }

        bw.write(ch);
        br.close();
        bw.flush();
        bw.close();
    }
}

//// 내가 짠 별로인 코드
//package BJ_22;
//
//import java.io.*;
//
//public class BJ_1157 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String a = br.readLine();
//
//        if (a.length() == 1) {
//            if ((int)a.charAt(0) >= 65 && (int)a.charAt(0) <= 90) {
//                bw.write(a.charAt(0) + "");
//                br.close();
//                bw.flush();
//                bw.close();
//                System.exit(0);
//            }
//            if ((int)a.charAt(0) >= 97 && (int)a.charAt(0) <= 122) {
//                bw.write(a.charAt(0) - 32);
//                br.close();
//                bw.flush();
//                bw.close();
//                System.exit(0);
//            }
//        }
//
//        int[] b = new int[26];
//
//        for (int i = 0; i < a.length(); i++) {
//            if ((int)a.charAt(i) >= 65 && (int)a.charAt(i) <= 90) {
//                b[(int)a.charAt(i) - 65]++;
//            }
//            if ((int)a.charAt(i) >= 97 && (int)a.charAt(i) <= 122) {
//                b[(int)a.charAt(i) - 97]++;
//            }
//        }
//
//        int max1 = b[0];
//        int c = 0;
//
//        for (int i = 1; i < b.length; i++) {
//            if (max1 < b[i]) {
//                max1 = b[i];
//                c = i;
//            }
//        }
//
//        for (int i = 1; i < c; i++) {
//            if (max1 == b[i]) {
//                bw.write("?");
//                br.close();
//                bw.flush();
//                bw.close();
//                System.exit(0);
//            }
//        }
//
//        for (int i = c + 1; i < b.length; i++) {
//            if (max1 == b[i]) {
//                bw.write("?");
//                br.close();
//                bw.flush();
//                bw.close();
//                System.exit(0);
//            }
//        }
//
//        char[] d = new char[]{ 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
//        char many = ' ';
//
//        int max2 = b[0];
//        many = d[0];
//
//        for (int i = 1; i < b.length; i++) {
//            if (max2 < b[i]) {
//                max2 = b[i];
//                many = d[i];
//            }
//        }
//
//        bw.write(many);
//        br.close();
//        bw.flush();
//        bw.close();
//    }
//}