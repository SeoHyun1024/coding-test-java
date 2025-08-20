import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static int N, M;

    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                if (j > 0) sb.append(' ');
                sb.append(i * M + j + 1);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

}