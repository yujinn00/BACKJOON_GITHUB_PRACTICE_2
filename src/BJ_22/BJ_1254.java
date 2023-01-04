package BJ_22;

import java.io.*;

public class BJ_1254 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        if (a.equals(new StringBuilder(a).reverse().toString())) {
            System.out.println(a.length());
        } else {
            for (int i = 1; i < a.length(); i++) {
                StringBuilder sb = new StringBuilder(a);

                sb.append(new StringBuilder(a.substring(0, i)).reverse());

                if (sb.toString().equals(sb.reverse().toString())) {
                    System.out.println(sb.length());
                    break;
                }
            }
        }
    }
}