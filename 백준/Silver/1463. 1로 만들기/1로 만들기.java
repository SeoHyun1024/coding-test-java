import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
    public static int N;
    public static int[] dp;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
		N = Integer.parseInt(br.readLine());
		
		// dp 초기화
		dp = new int[N + 1];
		dp[1] = 0;
		
	    for (int idx = 2; idx <= N; idx++){
	        dp[idx] = dp[idx - 1] + 1;
	        if (idx % 3 == 0) dp[idx] = Math.min(dp[idx], dp[idx/3] + 1);
	        if (idx % 2 == 0) dp[idx] = Math.min(dp[idx], dp[idx/2] + 1);    
	    }
		
		System.out.print(dp[N]);
	}
}