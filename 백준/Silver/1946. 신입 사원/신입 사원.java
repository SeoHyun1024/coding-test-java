import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 정수 입력
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            // case 별 정수 입력
            int N = Integer.parseInt(br.readLine());
            int[][] test = new int[N][2];

            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                test[j][0] = Integer.parseInt(st.nextToken());
                test[j][1] = Integer.parseInt(st.nextToken());
            }

            // 앞원소 기준으로 오름차순 정렬
            Arrays.sort(test, (a, b) -> Integer.compare(a[0], b[0]));

            int count = 0;
            int minSecond = Integer.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                if (test[i][1] < minSecond) {
                    count++;
                    minSecond = test[i][1];
                }
            }

            System.out.println(count);
        }
    }
}
