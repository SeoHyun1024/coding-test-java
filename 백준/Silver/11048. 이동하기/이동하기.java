import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int[][] maze;
    public static int[][] dp;
    public static int N, M;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    // N, M 입력
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    N = Integer.parseInt(st.nextToken());
	    M = Integer.parseInt(st.nextToken());
	    
	    // maze 배열 입력
	    maze = new int[N][M];
	    for (int i = 0; i< N; i++){
	        StringTokenizer st1 = new StringTokenizer(br.readLine());
	        for (int j = 0; j < M; j++){
	            maze[i][j] = Integer.parseInt(st1.nextToken());
	        }
	    }

	    dp = new int[N][M];
	    for (int i = 0; i < N; i++){
	        for (int j = 0; j < M; j++){
	            int a = (i > 0 && j > 0) ? dp[i - 1][j - 1] : 0 ; // 왼쪽 대각선
	            int b = (i > 0) ? dp[i - 1][j] : 0;  // 위
	            int c = (j > 0) ? dp[i][j - 1] : 0; // 왼쪽
	            
	            dp[i][j] = Math.max(a, Math.max(b, c)) + maze[i][j];
	        }
	    }
	    System.out.println(dp[N - 1][M - 1]);
	}
}