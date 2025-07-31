import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int T;
    static int N, M;

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());    // 테스트 케이스 갯수 입력
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());   // A 원소 갯수
            M = Integer.parseInt(st.nextToken());   // B 원소 갯수

            // 배열 선언
            int[] A = new int[N];
            int[] B = new int[M];

            // 각 배열 입력
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st1.nextToken());
            }

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                B[i] = Integer.parseInt(st2.nextToken());
            }

            // B 오름차순 정렬
            Arrays.sort(B);

            int count = 0;
            for (int a : A) {
                count += binarySearch(B, a);
            }
            System.out.println(count);
        }
    }

    public static int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < value) {
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}