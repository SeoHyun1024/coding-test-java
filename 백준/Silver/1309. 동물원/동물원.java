import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int[] dp;
    public static int N;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    // N 입력
	    N = Integer.parseInt(br.readLine());
	    
	    dp = new int[N + 1];
	    for (int i = 1; i<= N; i++){
	        if (i == 1) dp[i] = 3;
	        if (i == 2) dp[i] = 7;
	        if (i == 3) dp[i] = 17;
	        if (i > 3) dp[i] = (2*dp[i - 1] + dp[i - 2]) % 9901;
	    }
	    System.out.println(dp[N]);
	}
}