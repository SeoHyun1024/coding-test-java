import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int[][] triangle;
    public static int[][] dp;
    public static int N;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    // N 입력
	    N = Integer.parseInt(br.readLine());
	    triangle = new int[N][N];
	    for (int i = 0; i< N; i++){
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        for (int j = 0; j <= i; j++) triangle[i][j] = Integer.parseInt(st.nextToken());
	    }
	    
	    dp = new int[N][N];
	    for (int i = 0; i < N; i++){
	        for (int j = 0; j <= i; j++){
	            if (i == 0 && j == 0) dp[0][0] = triangle[0][0];
	            else{
    	            if (j == 0) dp[i][j] = dp[i - 1][0];
    	            if (j == i) dp[i][j] = dp[i - 1][i - 1];
    	            if (j != 0 && j != i) dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
    	            
    	            dp[i][j] += triangle[i][j];
	            }
	        }
	    }
	    
	    int max = 0;
	    for (int i = 0; i < N; i++){
	        if (max < dp[N - 1][i]) max = dp[N - 1][i];
	    }
	    
	    System.out.println(max);
	}
}