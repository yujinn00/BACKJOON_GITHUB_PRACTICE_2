package BJ_22;

import java.io.*;

public class BJ_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        String[] b = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

        for (int i = 0; i < 8; i++) {
            if (a.contains(b[i])) {
                a = a.replace(b[i], " ");
            }
        }

        System.out.println(a.length());
    }
}