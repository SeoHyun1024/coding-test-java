import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // test case 수 입력
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            // 날짜 수 입력
            int N = Integer.parseInt(br.readLine());

            int[] price = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                price[j] = Integer.parseInt(st.nextToken());    // 주가 입력
            }

            int max_profit = Integer.MIN_VALUE;
            long result = 0;

            for (int j = N - 1; j >= 0; j--) {
                if (price[j] > max_profit) {
                    max_profit = price[j];
                }
                result += max_profit - price[j];
            }

            System.out.println(result);
        }
    }
}
