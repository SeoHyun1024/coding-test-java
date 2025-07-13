import java.io.*;

public class Main {
    static int N;
    static int[] T;
    static int[] P;
    static int maxProfit = 0;

    public static void main(String[] args) throws IOException {
        // 정수 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        T = new int[N + 1];
        P = new int[N + 1];


        for (int i = 1; i <= N; i++) {
            String input[] = br.readLine().split(" ");
            T[i] = Integer.parseInt(input[0]);
            P[i] = Integer.parseInt(input[1]);
        }

        dfs(1, 0);

        System.out.println(maxProfit);
    }

    public static void dfs(int today, int sum) {
        if (today > N + 1) {
            // 퇴사날을 넘긴 경우
            return;
        }

        if (today == N + 1) {
            // 퇴사일 인 경우
            maxProfit = Math.max(maxProfit, sum);
            return;
        }
        if (today + T[today] <= N + 1) {
            dfs(today + T[today], sum + P[today]);
        }
        dfs(today + 1, sum);
    }
}
