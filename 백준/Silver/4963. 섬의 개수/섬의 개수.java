import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int w, h;   // 지도의 가로, 세로
    static int[][] map; // 지도
    static int[][] visited; // 방문했는지
    static int N;

    // 위쪽부터 시계방향
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            String[] input = br.readLine().split(" ");
            w = Integer.parseInt(input[0]);
            h = Integer.parseInt(input[1]);
            N = 0;

            // 0,0 입력받으면 종료
            if (w == 0 && h == 0) break;

            map = new int[h][w];
            visited = new int[h][w];

            // 지도 입력
            for (int i = 0; i < h; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1 && visited[i][j] == 0) { // 땅인데 방문 안됨
                        DFS(i, j);
                        N++;    // 섬 갯수 +1
                    }
                }
            }
            System.out.println(N);
        }
    }

    // DFS 탐색
    static void DFS(int x, int y) {
        visited[x][y] = 1;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < h && ny >= 0 && ny < w) {
                if (visited[nx][ny] == 0 && map[nx][ny] == 1) { // 땅이 방문안됨
                    DFS(nx, ny);
                }
            }
        }
    }
}