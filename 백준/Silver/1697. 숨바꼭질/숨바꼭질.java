import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, K; // 수빈이 위치(출발), 동생 위치(도착)
    static int[] dist = new int[100_001];  // 거리
    static boolean[] visited = new boolean[100_001];    // 방문했는지 저장

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 수빈이 위치, 동생 위치
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        bfs(N);

        System.out.println(dist[K]);
    }

    static void bfs(int N) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);

        dist[N] = 0;
        visited[N] = true;

        while (!queue.isEmpty()) {
            int n = queue.poll();   // 큐 삭제

            if (n == K) return;

            for (int i : new int[]{n + 1, n - 1, n * 2}) {
                if (i >= 0 && i <= 100_000 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    dist[i] = dist[n] + 1;  // 이전 노드 거리에서 +1
                }
            }
        }
    }
}

