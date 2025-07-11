import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 정수 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[][] snail = new int[N][N];  // 저장할 달팽이 배열 선언
        int value = N * N;  // 배열에 저장할 값
        int x = 0, y = 0;

        // 방향 (우 -> 하 -> 좌 -> 상)
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int dir = 0;    // 방향
        int step = 1;   // 이동 횟수

        snail[x][y] = value--;

        while (value > 0) {
            while (true) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if (nx < 0 || nx >= N || ny < 0 || ny >= N || snail[nx][ny] != 0) {
                    dir = (dir + 1) % 4;    // 방향전환
                    break;
                }
                snail[nx][ny] = value--;
                x = nx;  // x 좌표 갱신
                y = ny;  // y 좌표 갱신
            }
        }

        // 찾아야할 좌표값
        int ansX = 0, ansY = 0;

        // 달팽이 배열 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(snail[i][j] + " ");
                if (snail[i][j] == M) {
                    ansX = i + 1;
                    ansY = j + 1;
                }
            }
            System.out.println();
        }

        // 달팽이 배열 탐색하면서 해당값(M) 좌표 출력
        System.out.println(ansX + " " + ansY);
    }
}
