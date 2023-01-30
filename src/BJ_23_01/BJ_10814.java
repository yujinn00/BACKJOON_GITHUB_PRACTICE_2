// StringBuilder[] 및 카운팅 정렬 활용 => 빠름
package BJ_23_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder[] member = new StringBuilder[201]; // 입력되는 나이의 범위 : 1 ~ 200

        for (int i = 0; i < member.length; i++) {
            // 객체 배열의 인덱스에 각 StringBuilder 객체를 생성함
            member[i] = new StringBuilder();
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            // 나이를 index로 설정하여 해당 배열에 나이와 이름을 추가하는 카운팅 정렬 활용함
            member[age].append(age).append(" ").append(name).append("\n");
        }

        StringBuilder sb = new StringBuilder();

        for (StringBuilder mem : member) { // 여기서 나이 순대로 정렬되어 추가됨
            sb.append(mem);
        }

        System.out.println(sb);
    }
}

//// 람다식 활용 (인텔리제이 자동 변환) => 느림
//package BJ_23_01;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.StringTokenizer;
//
//public class BJ_10814 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int n = Integer.parseInt(br.readLine());
//        String[][] member = new String[n][2];
//
//        for (int i = 0; i < n; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//
//            member[i][0] = st.nextToken();
//            member[i][1] = st.nextToken();
//        }
//
//        Arrays.sort(member, Comparator.comparingInt(o -> Integer.parseInt(o[0]))); // 람다식 활용 (인텔리제이 자동 변환)
//
//        for (int i = 0; i < n; i++) {
//            sb.append(member[i][0]).append(" ").append(member[i][1]).append("\n");
//        }
//
//        System.out.println(sb);
//    }
//}