import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        int max_size = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int current = arr[i][j];
                for (int len = 1; i + len < N && j + len < M; len++) {
                    if (arr[i][j + len] == current &&
                            arr[i + len][j] == current &&
                            arr[i + len][j + len] == current) {
                        int area = (len + 1) * (len + 1);
                        if (area > max_size) max_size = area;
                    }
                }
            }
        }

        System.out.println(max_size);
    }
}
