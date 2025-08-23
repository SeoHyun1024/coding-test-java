import java.io.*;
import java.util.*;

class Main {
    static int N, answer;
    static int[][] height;
    static boolean[][] visited;
    static final int[] dx = {1, -1, 0, 0};
    static final int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        height = new int[N][N];
        int maxH = 0; // 최대 높이 추적

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                height[i][j] = Integer.parseInt(st.nextToken());
                if (height[i][j] > maxH) maxH = height[i][j];
            }
        }

        answer = 1; // 비가 안 올 때도 최소 1 영역 가능
        for (int h = 0; h <= maxH; h++) {     // 물 높이 h
            visited = new boolean[N][N];
            int cnt = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (height[i][j] > h && !visited[i][j]) { // 잠기지 않았고 미방문
                        cnt++;
                        bfs(i, j, h);
                    }
                }
            }
            if (cnt > answer) answer = cnt;
        }

        System.out.println(answer);
    }

    static void bfs(int sx, int sy, int water) {
        Queue<int[]> q = new LinkedList<>();
        visited[sx][sy] = true;
        q.offer(new int[]{sx, sy});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];

            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
                if (visited[nx][ny]) continue;
                if (height[nx][ny] <= water) continue; // 잠긴 칸 제외
                visited[nx][ny] = true;
                q.offer(new int[]{nx, ny});
            }
        }
    }
}
