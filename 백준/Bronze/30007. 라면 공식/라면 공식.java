import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int N; // 라면 끓이는 횟수
    public static int A, B, X;  // 라면계수(A), 기본 물의 양(B), 끓일 라면 수(X)
    public static long W;   // 필요한 물의 양

	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    N = Integer.parseInt(br.readLine());
	    
	    for (int i = 0; i < N; i++){
	        // 입력
            StringTokenizer st = new StringTokenizer(br.readLine());
	        A = Integer.parseInt(st.nextToken());
	        B = Integer.parseInt(st.nextToken());
	        X = Integer.parseInt(st.nextToken());
	        
	        W = (long) A*(X - 1) + B;
	        System.out.println(W);
	    }
	}
}