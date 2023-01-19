// 구글링 참고 코드
package BJ_23_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_17478 {
    public static String line = "";
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.").append("\n");

        rec(Integer.parseInt(br.readLine()));

        System.out.println(sb);
    }

    public static void rec(int a) {
        String under = line; // 이렇게 따로 저장하지 않으면 나중에 line이 줄어들지 않음

        if (a == 0) {
            sb.append(under).append("\"재귀함수가 뭔가요?\"").append("\n");
            sb.append(under).append("\"재귀함수는 자기 자신을 호출하는 함수라네\"").append("\n");
            sb.append(under).append("라고 답변하였지.").append("\n");
            return;
        }

        sb.append(under).append("\"재귀함수가 뭔가요?\"").append("\n");
        sb.append(under).append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.").append("\n");
        sb.append(under).append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.").append("\n");
        sb.append(under).append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"").append("\n");

        line += "____";

        rec(a - 1);

        sb.append(under).append("라고 답변하였지.").append("\n");
    }
}

//// 내가 짠 별로인 코드 1 => for 문 활용
//package BJ_23_01;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class BJ_17478 {
//    public static int n;
//    public static String str1 = "\"재귀함수가 뭔가요?\"";
//    public static String str2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
//    public static String str3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
//    public static String str4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
//    public static String str5 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
//    public static String str6 = "라고 답변하였지.";
//    public static StringBuilder sb = new StringBuilder();
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.").append("\n");
//
//        n = Integer.parseInt(br.readLine());
//
//        rec(n);
//
//        System.out.println(sb);
//    }
//
//    public static void rec(int a) {
//        for (int i = a; i < n; i++) sb.append("____");
//        sb.append(str1).append("\n");
//        for (int i = a; i < n; i++) sb.append("____");
//        sb.append(str2).append("\n");
//        for (int i = a; i < n; i++) sb.append("____");
//        sb.append(str3).append("\n");
//        for (int i = a; i < n; i++) sb.append("____");
//        sb.append(str4).append("\n");
//
//        if (a == 1) {
//            for (int i = a; i <= n; i++) sb.append("____");
//            sb.append(str1).append("\n");
//            for (int i = a; i <= n; i++) sb.append("____");
//            sb.append(str5).append("\n");
//
//            while (a < n + 2) {
//                for (int i = a; i <= n; i++) sb.append("____");
//                sb.append(str6).append("\n");
//                a++;
//            }
//        } else {
//            a--;
//            rec(a);
//        }
//    }
//}

//// 내가 짠 별로인 코드 2 => repeat() 함수 활용
//package BJ_23_01;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class BJ_17478 {
//    public static int n;
//    public static String str1 = "\"재귀함수가 뭔가요?\"";
//    public static String str2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
//    public static String str3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
//    public static String str4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
//    public static String str5 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
//    public static String str6 = "라고 답변하였지.";
//    public static StringBuilder sb = new StringBuilder();
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.").append("\n");
//
//        n = Integer.parseInt(br.readLine());
//
//        rec(n);
//
//        System.out.println(sb);
//    }
//
//    public static void rec(int a) {
//        sb.append("____".repeat(n - a)).append(str1).append("\n");
//        sb.append("____".repeat(n - a)).append(str2).append("\n");
//        sb.append("____".repeat(n - a)).append(str3).append("\n");
//        sb.append("____".repeat(n - a)).append(str4).append("\n");
//
//        if (a == 1) {
//            sb.append("____".repeat(n - a + 1)).append(str1).append("\n");
//            sb.append("____".repeat(n - a + 1)).append(str5).append("\n");
//
//            while (a < n + 2) {
//                sb.append("____".repeat(n - a + 1)).append(str6).append("\n");
//                a++;
//            }
//        } else {
//            a--;
//            rec(a);
//        }
//    }
//}