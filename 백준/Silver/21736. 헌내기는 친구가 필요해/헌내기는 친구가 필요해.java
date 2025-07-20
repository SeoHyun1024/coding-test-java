import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int N, M;   // 캠퍼스의 세로, 가로
    static char[][] campus; // 캠퍼스
    static boolean[][] visited; // 방문했는지
    static int[] start;     // 도연이 위치
    static int count = 0;

    // 상 하 좌 우
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        campus = new char[N][M];
        visited = new boolean[N][M];

        // 캠퍼스 상황 입력
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                campus[i][j] = line.charAt(j);
                if (campus[i][j] == 'I') {
                    start = new int[]{i, j};
                }
            }
        }

        BFS(start[0], start[1]);    // BFS 로 도연이부터 탐색 시작

        if (count == 0) {
            System.out.println("TT");
        } else System.out.println(count);
    }
    
    // BFS 함수
    static void BFS(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] n = queue.poll();   // 큐 삭제

            for (int i = 0; i < 4; i++) {
                int nx = n[0] + dx[i];
                int ny = n[1] + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (campus[nx][ny] != 'X' && !visited[nx][ny]) {
                        visited[nx][ny] = true; // 방문
                        if (campus[nx][ny] == 'P') {
                            count++;
                        }
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}