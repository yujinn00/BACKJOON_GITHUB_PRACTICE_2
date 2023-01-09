package BJ_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BJ_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());

        System.out.println(a.add(b));
    }
}

/*
BigInteger 클래스 (import 필수)
1. long 보다 더 큰 무한대 정수를 담을 수 있는 타입이자 클래스
2. 정수가 아닌 String 타입이기 때문에 일반적인 사칙연산을 하면 컴파일 에러
3. 따라서 사칙연산을 할 때엔 내장된 사칙연산 함수를 활용
*/