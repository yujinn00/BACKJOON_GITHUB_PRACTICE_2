package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        int day = (height - up) / (up - down) + 1;

        if ((height - up) % (up - down) != 0) {
            System.out.println(day + 1);
        } else {
            System.out.println(day);
        }
    }
}

/*
cf) 반복문을 사용하면 시간 초과가 뜸
1. 우선 (height - up)까지 도달해야 함
2. 하루에 (up - down)만큼씩 올라감
3-1. 도달했으면 마지막 up을 통해 height까지 완주하면 됨
3-2. 도달까지 up 미만 거리만큼 남으면 3-1보다 하루 더 소요하면 됨
*/