import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int T, k;
    static boolean[] isNotPrime;
    static int MAX_PRIME = 1299709;
    
	public static void main (String[] args) throws java.lang.Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
	    isNotPrime = new boolean[MAX_PRIME + 2];    // 양끝 경계 + 2
	    isNotPrime[0] = isNotPrime[1] = true;
	    
	    // 합성수 배열 초기화
	    for (int i = 2; i * i <= MAX_PRIME; i++){
	        if(!isNotPrime[i]){
	            for (int j = i * i; j <= MAX_PRIME + 1; j += i){
	                isNotPrime[j] = true;
	            }
	        }
	    }
 
	    
	    for (int i = 0; i < T; i++){
	        // k 입력
	        k = Integer.parseInt(br.readLine());
	        
	        if (!isNotPrime[k]) System.out.println(0);
	        else{
	            int left = k, right = k;
	            
	            while(isNotPrime[left]) left--;
	            while(isNotPrime[right]) right++;
	            
	            System.out.println(right - left);
	        }
	    }
	}
	
}
