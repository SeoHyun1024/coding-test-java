import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N, M;
    static int[] budgets;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    N = Integer.parseInt(st.nextToken()); // 일 수
	    M = Integer.parseInt(st.nextToken()); // 인출 횟수
	    
	    // 사용할 금액 입력
	    budgets = new int[N];
	    
	    for (int i = 0; i < N; i++){
	        budgets[i] = Integer.parseInt(br.readLine());
	    }
	    
	    int left = Arrays.stream(budgets).max().getAsInt(), right = Arrays.stream(budgets).sum();
	    int answer = 0;
	    
	    while(left <= right){
	        int mid = (left + right) / 2;
	        if (isPossible(M , mid)) {
	            answer = mid;
	            right = mid - 1;
	        }
	        else{
	            left = mid + 1;  
	        } 
	       // System.out.println("left : " + left + " right : " + right + " mid : " + mid + " answer : " + answer);
	    }
	    System.out.println(answer);
	}
	
	// amount 로 살 수 있는지 확인
	public static boolean isPossible(int K, int amount){
	    int count = 1;
	    int remain = amount;
	    
	    for (int b : budgets){
	        if (remain < b) {
	            count++;    // 인출 횟수 증가
	            remain = amount;
	        }
	        remain -= b;
	    }
	    
	    return count <= K;  // 총 인출 횟수가 K 보다 작거나 같으면 true
	}
}
