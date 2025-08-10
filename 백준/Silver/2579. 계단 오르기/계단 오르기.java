import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int[] stairs;
    public static int[] dp;
    public static int N;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    N = Integer.parseInt(br.readLine());
	    
	    stairs = new int[N + 1];
	    // 계단 입력
	    for (int i = 1; i <= N; i++){
	        stairs[i] = Integer.parseInt(br.readLine());
	    }
	    
	    dp = new int[N + 1];
	    for (int i = 1; i<= N; i++){
	        if (i == 1) dp[i] = stairs[i];
	        if (i == 2) dp[i] = stairs[i - 1] + stairs[i];
	        if (i == 3) dp[i] = Math.max(stairs[i - 2] + stairs[i] , stairs[i - 1] + stairs[i]);
	        
	        if (i > 3){
	            dp[i] = Math.max(dp[i - 2] + stairs[i], dp[i - 3] + stairs[i - 1] + stairs[i]);    
	        }
	    }
	    System.out.println(dp[N]);
	}
}