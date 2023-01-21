// char[] 배열 활용 (빠름)
package BJ_23_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();

            if (str.equals(".")) { // 종료 조건문
                break;
            }

            sb.append(balance(str)).append("\n");
        }

        System.out.println(sb);
    }

    public static String balance(String str) {
        char[] arr = new char[str.length()]; // 스택처럼 사용하기 위한 배열
        int size = 0;

        for (char chr : str.toCharArray()) { // str의 한 글자마다 char 타입의 배열로 저장
            if (chr == '(' || chr == '[') { // 여는 괄호일 경우, 배열에 저장 후 size 증가
                arr[size] = chr;
                size++;
            } else if (chr == ')') { // 닫는 소괄호일 경우, 실행
                if (size == 0 || arr[size - 1] != '(') { // 배열이 비어있거나, 배열의 마지막 요소가 소괄호랑 매칭이 되지 않을 경우, no 반환
                    return "no";
                } else {
                    size--;
                }
            } else if (chr == ']') { // 닫는 대괄호일 경우, 실행
                if (size == 0 || arr[size - 1] != '[') { // 배열이 비어있거나, 배열의 마지막 요소가 대괄호랑 매칭이 되지 않을 경우, no 반환
                    return "no";
                } else {
                    size--;
                }
            }
        }

        if (size == 0) { // 소괄호 및 대괄호의 입력이 없었거나, 균형 상태가 정상적으로 이루어져 size가 0일 경우, yes 반환
            return "yes";
        } else { // 균형 상태가 정상적으로 이루어지지 않아 size가 0보다 클 경우, no 반환 (0보다 작은 경우는 위의 for 문에서 이미 해결됨)
            return "no";
        }
    }
}

//// stack 활용 (느림)
//package BJ_23_01;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Stack;
//
//public class BJ_4949 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        while (true) {
//            String str = br.readLine();
//
//            if (str.equals(".")) { // 종료 조건문
//                break;
//            }
//
//            sb.append(balance(str)).append("\n");
//        }
//
//        System.out.println(sb);
//    }
//
//    public static String balance(String str) {
//        Stack<Character> stack = new Stack<>(); // 자료 구조 stack 선언 (LIFO) // push() : 추가, peek() : 반환, pop() : 제거
//
//        for (int i = 0; i < str.length(); i++) { // str의 한 단어씩 chr에 저장
//            char chr = str.charAt(i);
//
//            if (chr == '(' || chr == '[') { // 여는 괄호일 경우, 스택에 push
//                stack.push(chr);
//            } else if (chr == ')') { // 닫는 소괄호일 경우, 실행
//                if (stack.empty() || stack.peek() != '(') { // 스택이 비어있거나, 스택의 마지막 요소가 소괄호랑 매칭이 되지 않을 경우, no 반환
//                    return "no";
//                } else {
//                    stack.pop();
//                }
//            } else if (chr == ']') { // 닫는 대괄호일 경우, 실행
//                if (stack.empty() || stack.peek() != '[') { // 스택이 비어있거나, 스택의 마지막 요소가 대괄호랑 매칭이 되지 않을 경우, no 반환
//                    return "no";
//                } else {
//                    stack.pop();
//                }
//            }
//        }
//
//        if (stack.empty()) { // 소괄호 및 대괄호의 입력이 없었거나, 균형 상태가 정상적으로 이루어져 stack이 비어있을 경우, yes 반환
//            return "yes";
//        } else { // 균형 상태가 정상적으로 이루어지지 않아 stack이 비어있지 않을 경우, no 반환
//            return "no";
//        }
//    }
//}