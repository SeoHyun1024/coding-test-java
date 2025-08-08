import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int N;
    public static int[] dp;
    public static int[] from;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
		N = Integer.parseInt(br.readLine());
		
		// dp 초기화
		dp = new int[N + 1];
		from = new int[N + 1];
		
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[1] = 0;
		
		// 연산
	    for (int idx = 2; idx <= N; idx++){
	        if (dp[idx] > dp[idx - 1] + 1){
	            dp[idx] = dp[idx - 1] + 1;
	            from[idx] = idx - 1;
	        }
	        
	        // 3으로 나누어 떨어질 때
	        if (idx % 3 == 0 && dp[idx] > dp[idx / 3] + 1) {
                dp[idx] = dp[idx / 3] + 1;
                from[idx] = idx / 3;
	        }
	        
	        // 2로 나누어 떨어질 때
	        if (idx % 2 == 0 && dp[idx] > dp[idx / 2] + 1) {
	                dp[idx] = dp[idx / 2] + 1;
	                from[idx] = idx / 2;
	        }
	    }
	    
	    // 최소 연산 횟수
	    System.out.println(dp[N]);
	    
	    // 방법 출력
	    StringBuilder sb = new StringBuilder();
	    
	    while(N > 0){
	        sb.append(N).append(" ");
	        N = from[N];
	    }
		
		System.out.println(sb);
		
	}
}