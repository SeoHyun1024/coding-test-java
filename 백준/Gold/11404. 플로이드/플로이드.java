import java.io.*;
import java.util.*;

public class Main {
    static int N; // 도시 갯수
    static int M; // 버스 갯수
    static int[][] minCost; // 최소 비용
    static final int INF = (int) 1e9;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        // 최소비용 배열 초기화
        minCost = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(minCost[i], INF);
            minCost[i][i] = 0; // 자기 자신은 0
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int departure = Integer.parseInt(st.nextToken()) - 1;
            int destination = Integer.parseInt(st.nextToken()) - 1;
            int cost = Integer.parseInt(st.nextToken());

            if (cost < minCost[departure][destination]) {
                minCost[departure][destination] = cost; // 최솟값 갱신
            }

        }

        // 플로이드-워셜
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (minCost[i][j] > minCost[i][k] + minCost[k][j]) {
                        minCost[i][j] = minCost[i][k] + minCost[k][j];
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (minCost[i][j] == INF) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(minCost[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

