// Comparator 사용
package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BJ_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        String[] b = new String[a];

        for (int i = 0; i < a; i++) {
            b[i] = br.readLine();
        }

        Arrays.sort(b, new Comparator<String>() { // 익명 클래스를 이용해 Comparator 인터페이스의 객체를 1회용 생성
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2); // 길이가 같으면 사전순 정렬
                } else {
                    return o1.length() - o2.length(); // 길이가 다르면 오름차순 정렬
                }
            }
        });

        sb.append(b[0]).append("\n"); // 정렬된 첫 단어 sb 저장

        for (int i = 1; i < a; i++) {
            if (!b[i].equals(b[i - 1])) { // 같은 단어는 한 번씩만 sb 저장
                sb.append(b[i]).append("\n");
            }
        }

        System.out.println(sb);
    }
}

//// lambda 사용
//package BJ_22;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//
//public class BJ_1181 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int a = Integer.parseInt(br.readLine());
//        String[] b = new String[a];
//
//        for (int i = 0; i < a; i++) {
//            b[i] = br.readLine();
//        }
//
//        Arrays.sort(b, (o1, o2) -> o1.length() == o2.length() ? o1.compareTo(o2) : o1.length() - o2.length());
//        sb.append(b[0]).append("\n"); // 정렬된 첫 단어 sb 저장
//
//        for (int i = 1; i < a; i++) {
//            if (!b[i].equals(b[i - 1])) { // 같은 단어는 한 번씩만 sb 저장
//                sb.append(b[i]).append("\n");
//            }
//        }
//
//        System.out.println(sb);
//    }
//}