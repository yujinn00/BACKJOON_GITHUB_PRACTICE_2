package BJ_22;

import java.io.*;

public class BJ_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String[] b = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" }; // dz=가 z=보다 앞에 있으므로 딱히 고려할 것은 없음

        for (String c : b) { // b의 요소들을 하나씩 c로 대입
            if (a.contains(c)) { // a 안에 c가 있으면 실행
                a = a.replace(c, " "); // a 안에 있는 c를 빈칸으로 대체
            }
        }

        System.out.println(a.length());
    }
}