package BJ_23_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_24060 {
    public static int n, m;
    public static int[] arr, tmp;
    public static int count, result = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        tmp = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(arr, 0, n - 1);
        System.out.println(result);
    }
    // arr[start..end]을 오름차순 정렬함
    public static void merge_sort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            merge_sort(arr, start, mid); // 전반부 정렬
            merge_sort(arr, mid + 1, end); // 후반부 정렬
            merge(arr, start, mid, end); // 합병
        }
    }
    // arr[start..mid]와 arr[mid+1..end]을 병합하여 arr[start..end]을 오름차순 정렬된 상태로 만듦
    // arr[start..mid]와 arr[mid+1..end]은 이미 오름차순으로 정렬되어 있음
    public static void merge(int[] arr, int start, int mid, int end) {
        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                tmp[k++] = arr[i++];
            } else {
                tmp[k++] = arr[j++];
            }
        }

        while (i <= mid) { // 왼쪽 배열 부분이 남은 경우
            tmp[k++] = arr[i++];
        }

        while (j <= end) { // 오른쪽 배열 부분이 남은 경우
            tmp[k++] = arr[j++];
        }

        i = start; k = 0;

        while (i <= end) { // 결과를 arr[start..end]에 저장
            count++;

            if (count == m) { // 제시된 병합 정렬 의사 코드에서 유일하게 새로 추가한 코드
                result = tmp[k];
                break;
            }

            arr[i++] = tmp[k++];
        }
    }
}